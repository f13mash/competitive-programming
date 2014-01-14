package com;
import java.io.*;
import java.util.*;
 
public class Solution1{
    public static void main(String[] args) {

        MyScanner sc = new MyScanner();   // Use MyScanner class.
                                          // The constructor MyScanner() has no argument
                                          // as opposed to Scanner(System.in)!
        
        int n = sc.nextInt();
        
        int[][] cost = new int[n+1][n+1];
        
        Map<Integer, List<Integer>> ll = new HashMap<Integer, List<Integer>>();
        
        for(int i=1;i<=n;i++) {
        	String[] splt = sc.nextLine().trim().split(" ");
        	int id = Integer.parseInt(splt[0]) + 1;
        	int money = Integer.parseInt(splt[1]);
        	int con1 = Integer.parseInt(splt[2].contains("E") ? "-1" : splt[2]) + 1;
        	int con2 = Integer.parseInt(splt[3].contains("E") ? "-1" : splt[3]) + 1;
        	
        	if(id == 1){
        		ll.put(0, new ArrayList<Integer>());
        		ll.get(0).add(id);
        		cost[0][id] = money;
        	}
        	cost[id][con1] = money;
        	cost[id][con2] = money;
        	
        	if(!ll.containsKey(id)) {
        		ll.put(id, new ArrayList<Integer>());
        	}
        	ll.get(id).add(con1);
        	ll.get(id).add(con2);
        }
        int max = 0;
        for(int i=1;i<=n;i++) {
        	if(cost[0][i] > 0) {
        		List<Integer> c = ll.get(i);
        		if(c.contains(0)) {
        			max = Math.max(max, cost[i][0]);
        		}
        		for(int v : c) {
        			if(v!=0) {
        				
        			}
        		}
        	}
        }
        
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