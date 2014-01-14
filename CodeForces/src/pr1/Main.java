package pr1;
import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
    	MyScanner sc = new MyScanner(); 
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        	arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
        int[] cnt = new int[8];
        boolean ans = true;
        for(int i : arr) {
        	cnt[i]++;
        	if(i ==5 || i == 7){
        		ans = false;
        		break;
        	}
        }
        StringBuilder out = new StringBuilder();
        int fours = cnt[4];
        if(cnt[4] > cnt[2] || cnt[4] > cnt[1] || !ans) {
        	ans = false;
        }
        else {
        	for(int i=0;i<cnt[4];i++) {
        		out.append(1+" "+2+" "+4+"\n");
        	}
        	cnt[2] -= cnt[4];
        	cnt[1] -= cnt[4];
        	cnt[4] = 0;
        	
        }
        
        int sixes = cnt[6];
        
        if(cnt[6] != (cnt[2]+cnt[3]) || cnt[6] != cnt[1] || !ans) {
        	ans = false;
        }
        else {

        	for(int i=0;i<cnt[6];i++) {
        		if(cnt[2] > 0){
        			out.append(1+" "+2+" "+6+"\n");
        			cnt[2]--;
        		}
        		else{

        			out.append(1+" "+3+" "+6+"\n");
        			cnt[3]--;
        		}
        			
        	}
        	cnt[6]=cnt[2]=cnt[3]=cnt[1]=0;
        }
        
        
        String pri = out.toString().trim();
        if(!ans) {
        	pri = "-1";
        }
        
        System.out.println(pri);
        
 
    }
 
    //-----------MyScanner class for faster input----------------------------------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine(){
            String str="";
            try {
                str =  br.readLine().toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
    }
    //----------------------------------------------------------------------------
}