import java.util.ArrayList;
import java.util.List;

public class GameOnABoard {

	int[][] mp = null;
	boolean[][] vis = null;
	int m, n;
	int[][] res = null;
	public int optimalChoice(String[] cost) {
		
		mp = new int[cost.length][cost[0].length()];
		
		
		for(int i =0;i < mp.length; i++){
			char[] arr = cost[i].toCharArray();
			for(int j = 0; j < arr.length; j++){
				mp[i][j] = arr[j] == '0' ? 0 : 1;
			}
		}
		
		m = mp.length;
		n = mp[0].length;
		
		vis = new boolean[m][n];
		res = new int[m][n];
		
		int min = 1000000;
		
		for(int i=0; i< m; i++){
			for(int j = 0; j < n; j ++){
				eval(i, j);
				int max = 0;
				
				for(int a =0; a< m ; a++){
					for(int b = 0; b < n; b++){
						max = Math.max(max, res[a][b]);
					}
				}
				
				min = Math.min(max, min);
			}
		}
		
		
		return min;
		
	}
	
	
	public void eval(int x, int y){
		for(int i = 0; i< m ;i ++){
			for(int j = 0; j< n ; j++){
				vis[i][j] = false;
				res[i][j] = 10000;
			}
		}
		
		res[x][y] = mp[x][y];
		vis[x][y] = true;
		
		List<Integer> xVis = new ArrayList<Integer>();
		List<Integer> yVis = new ArrayList<Integer>();
		
		xVis.add(x);
		yVis.add(y);
		
		while(xVis.size() > 0){
			int i = xVis.remove(0);
			int j = yVis.remove(0);
			
			if(i > 0 && res[i-1][j] > (res[i][j] + mp[i-1][j])){
				res[i-1][j] = res[i][j] + mp[i-1][j];
				xVis.add(i-1);
				yVis.add(j);
			}
			
			if( i < (m -1 ) && res[i+1][j] > (res[i][j] + mp[i+1][j])){
				res[i+1][j] = res[i][j] + mp[i+1][j];
				xVis.add(i+1);
				yVis.add(j);
			}
			
			if(j > 0 && res[i][j-1] > (res[i][j] + mp[i][j-1])){
				res[i][j-1] = res[i][j] + mp[i][j-1];
				xVis.add(i);
				yVis.add(j-1);
			}
			
			if(j < (n - 1) && res[i][j+1] > (res[i][j] + mp[i][j+1])){
				res[i][j+1] = res[i][j] + mp[i][j+1];
				xVis.add(i);
				yVis.add(j+1);
			}
			
			
		}
		
		return ;
	}

}
