package pr3;
import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();  
        
        int r = sc.nextInt();
        int h = sc.nextInt();
        
        double c1 = h + (double)r/2, c2=h-(double)r*Math.sin(Math.toRadians(60)) + (double)r;

    	double hv = Math.sin(Math.toRadians(60));
        System.out.println(c1 +" : "+c2+" : "+hv);
        
        int max = Math.max(eval(c1, r), eval(c2,r)+1);
        System.out.println(max);
    }
    
    public static int eval(double e, int r) {
    	e -= r;
    	if(e < 0)
    		return 0;
    	double hv = Math.sin(Math.toRadians(60));
    	
    	int cnt = (int)((double)e/(r*hv));
    	
    	int add = 0;
    	System.out.println(cnt);
    	if(cnt%2 == 1) {
    		double sp = e+(double)r/2-cnt*r*hv;
    		
    		double req = r*hv+(double)r/2;
    		
    		if(req <= sp){
    			add = 2;
    		}
    	}
    	else {
    		double sp = e+(double)r/2-cnt*r*hv;
    		
    		double req = r*hv+(double)r/2;
    		
    		if(req <= sp){
    			add = 1;
    		}
    	}
    	int ret = 0;
    	if(cnt%2==1) {
    		ret = (cnt+1)/2*3;
    	}
    	else {
    		ret = (cnt)/2*3 + 2;
    	}
    	
    	
    	return ret+add;
    	
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