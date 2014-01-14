package pr2;

import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {

        MyScanner sc = new MyScanner();   // Use MyScanner class.
                                          // The constructor MyScanner() has no argument
                                          // as opposed to Scanner(System.in)!
 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        StringBuilder out = new StringBuilder();
        int inc = (f-s) < 0 ? -1 : 1;
    	int curr = s;
        int pt = 0;
        for(int i=0;i<m && curr!=f;i++) {
        	int t = sc.nextInt();
        	int l = sc.nextInt();
        	int r = sc.nextInt();
        	if(curr==f)
        		break;
        	if((curr >=l && curr <=r)  || ((curr+inc) >=l && (curr+inc) <= r)) {
        		out.append('X');
    			continue;
    		}
        	if(inc == 1) {
        		if(curr < l){
        			int min = Math.min(l-curr-1, f-curr);
        			min = Math.min(1, min);
        			curr += min;
        			
        			out.append('R');
        			
        		}
        		else 
        			if(curr > r) {
        				int min = f-curr;
            			min = Math.min(1, min);

            			curr += min;
            			out.append('R');
            			
            			
        			}
        	}
        	else {
        		if(curr < l){
        			int min = curr-f;
        			min = Math.min(1, min);

        			curr -= min;
        			out.append('L');
        			
        		}
        		else 
        			if(curr > r) {
        				int min = Math.min(curr-f, curr-r-1);
            			min = Math.min(1, min);

            			curr -= min;
            			out.append('L');
        			}
        	}
        	pt=t;

        }
        System.out.println(out.toString());
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
 
    }
    //----------------------------------------------------------------------------
