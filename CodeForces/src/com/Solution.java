package com;
import java.io.*;
import java.util.*;
 
public class Solution{
    public static void main(String[] args) {

        MyScanner sc = new MyScanner();   // Use MyScanner class.
                                          // The constructor MyScanner() has no argument
                                          // as opposed to Scanner(System.in)!
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        char[][] mp = new char[m][];
        
        for(int i=0;i<m;i++) {
        	mp[i] = sc.nextLine().trim().toCharArray();
        }
        
        
        int eny,enx,sty,stx;
		stx = sty = enx = eny= -1;
		
		List<State> teleports = new ArrayList<State>();
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mp[i][j] == '@') {
					stx = i;
					sty = j;
				}
				
				if(mp[i][j] == '$') {
					enx = i;
					eny = j;
				}
				
				if(mp[i][j] == 'T') {
					teleports.add(new State(i, j, false, false));
				}
			}
		}
		
		State start = new State(stx, sty, true, false);
		State end = new State(enx, eny, false, false);
		
		List<State> q = new ArrayList<State>();
		
		String[][] dir1 = {{ null ,"SOUTH", "EAST", "NORTH", "WEST"}, { null , "WEST", "NORTH", "EAST", "SOUTH"}};
		
		
		//i,j,dir,beer
		boolean[][][][] vis = new boolean[m][n][2][2];
		
		q.add(start);
		vis[stx][sty][1][0] = true;

		State dest = null;
		while(q.size() > 0 && dest == null) {
			State curr = q.remove(q.size()-1);

			int[][] op = null;
			String[] dir = null;
			int[] goDir = curr.goDir;
			if(curr.dir) {
				int[][] d = { goDir, {1,0} , {0,1} , {-1,0} , {0,-1}};
				op = d;
				dir = dir1[0];
				dir[0] = curr.dFrom;
			}
			else {
				int[][] d = { goDir, {0,-1} , {-1,0} , {0,1} ,{1,0}};
				op = d;
				dir = dir1[1];
				dir[0] = curr.dFrom;
			}
			
			char cv = mp[curr.x][curr.y];
			//System.out.println("cur : ("+curr.x+" , "+curr.y+")  from : "+curr.dFrom+" : "+curr.beer+"  ::::   "+q.size() );

			if(cv == 'N') {
				int[][] od = {{-1,0}};
				String[] odir = {"NORTH"};
				dir = odir;
				op = od;
			}
			
			if(cv == 'S') {
				int[][] od = {{1,0}};
				String[] odir = {"SOUTH"};
				dir = odir;
				op = od;
			}
			
			if(cv == 'E') {
				int[][] od = {{0,1}};
				String[] odir = {"EAST"};
				dir = odir;
				op = od;
			}
			
			if(cv == 'W') {
				int[][] od = {{0,-1}};
				String[] odir = {"WEST"};
				dir = odir;
				op = od;
			}
			
			for(int i=0;i<op.length;i++) {
				int ni = curr.x + op[i][0];
				int nj = curr.y + op[i][1];
				boolean skip = false;
				boolean d = curr.dir;
				//boolean tp = false;
				
				boolean b = curr.beer;
				
				boolean overrideDir = false;
				
				if(op[i][0] == 0 && op[i][1] == 0)
					continue;
				switch (mp[ni][nj]) {
				case '#' :
					skip = true;
					break;
				case 'X' : 
					if(b) {
						skip = false;
					}
					else {
						skip = true;
					}
					break;
				case 'T' : 
				{
					State tele = teleports.get(0);
					if(tele.x == ni && tele.y == nj){
						tele = teleports.get(1);
					}
					
					ni = tele.x;
					nj = tele.y;

					break;
				}
				
				case 'B' : {
					b = !b;
					break;
				}
				case 'I' : {
					d = !d;
					break;
				}
				
				case 'S' : {
					//ni++;
					break;
				}
				
				case 'E' : {
					//nj++;
					break;
				}
				
				case 'N' : {
					//ni--;
					break;
				}
				
				case 'W' : {
					//nj--;
					break;
				}
				
				case ' ' : {
					break;
				}

				case '$' : 
				{
					dest = new State(ni, nj, d, b);
					dest.parent = curr;
					dest.dFrom = dir[i];
					skip = true;
					break;
				}
								
				}

				if(skip) {
					continue;
				}

				int id = d == true ? 1 : 0;
				int ib = b == true ? 1 : 0;
				if(ni >= 0 && ni < m && nj >= 0 && nj < n) {
					vis[ni][nj][id][ib] = true;
					
					State ns = new State(ni, nj, id == 1, ib == 1);
					//System.out.println("\t ("+ni+" , "+nj+") : "+skip+" :: "+ns.x+" :: "+ns.y);				

					ns.parent = curr;
					ns.dFrom = dir[i];
					ns.goDir = op[i];
					q.add(ns);
					
					if(mp[ni][nj] == 'X')
						mp[ni][nj] = ' ';
				}

				break;
				
			}
			
		}
		
		StringBuffer out = new StringBuffer();
		if(dest == null) {
			out.append("LOOP");
		}
		else {
			List<String> route = new ArrayList<String>();
			State c = dest;
			do {
				route.add(c.dFrom);
				c = c.parent;
			}
			while(c.parent != null);

			Collections.reverse(route);
			for(String s : route) {
				out.append(s);
				out.append("\n");
			}
			
		}
		
		System.out.print(out.toString());
		
 
    }
    
    
    
    public static class State {
    	
    	int x, y;
    	
    	boolean dir = true;
    	boolean beer = false;
    	
    	String dFrom = null;
    	State parent = null;
    	
    	int[] goDir = {0,0};
    	
    	public State(int x, int y, boolean dir, boolean beer) {
    		this.x = x;
    		this.y = y;
    		this.beer = beer;
    		this.dir = dir;
    	}
    	
    	public boolean isEqualTo(State s) {
    		return (this.x == s.x && this.y == s.y);
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