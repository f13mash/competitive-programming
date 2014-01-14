package com;
import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        long n;   // long for large integers
        long m;
        long a;
 
        MyScanner sc = new MyScanner();   // Use MyScanner class.
                                          // The constructor MyScanner() has no argument
                                          // as opposed to Scanner(System.in)!
 
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