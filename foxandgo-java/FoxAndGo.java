import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FoxAndGo {

	public int maxKill(String[] board) {
		int n = board.length;
		int w = board[0].length();
		char[][] arr = new char[n][];
		
		for(int i=0;i<n;i++) {
			arr[i] = board[i].toCharArray();
		}
		
		boolean[][] vis = new boolean[n][w];
		int max = 0;
		int zeroC = 0;
		boolean freeSpace = false;
		Map<String, Integer> vv = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<w;j++) {
				if(arr[i][j] == '.')
					freeSpace = true;
				if(vis[i][j] || arr[i][j] != 'o')
					continue;
				
				List<Integer> iq = new ArrayList<Integer>();
				List<Integer> jq = new ArrayList<Integer>();
				
				iq.add(i);
				jq.add(j);
				vis[i][j] = true;
				int cnt = 1;
				boolean canKill = false;
				Set<Integer> as = new HashSet<Integer>();
				Set<Integer> bs = new HashSet<Integer>();
				while(iq.size()>0) {
					int x = iq.remove(0);
					int y = jq.remove(0);
					if(((y+1) < w && arr[x][y+1]=='.') || ((x+1)<n && arr[x+1][y] =='.') || ((x-1)>=0 && arr[x-1][y]=='.') || ((y-1)>=0 && arr[x][y-1]=='.'))
							canKill = true;
					if(((y+1) < w && arr[x][y+1]=='.')) {
						as.add(x);
						bs.add(y+1);
					}
					if( ((x+1)<n && arr[x+1][y] =='.')) {
						as.add(x+1);
						bs.add(y);
					}
					if((x-1)>=0 && arr[x-1][y]=='.') {
						as.add(x-1);
						bs.add(y);
					}
					if(((y-1)>=0 && arr[x][y-1]=='.')) {
						as.add(x);
						bs.add(y-1);
					}
					if(((y+1) < w && arr[x][y+1]=='o' && !vis[x][y+1])) {
						iq.add(x);
						jq.add(y+1);
						vis[x][y+1] = true;
						cnt++;
					}
					if(((x+1) < n && arr[x+1][y]=='o' && !vis[x+1][y])) {
						iq.add(x+1);
						jq.add(y);
						vis[x+1][y] = true;
						cnt++;
					}
					if(((x-1) >= 0 && arr[x-1][y]=='o' && !vis[x-1][y])) {
						iq.add(x-1);
						jq.add(y);
						vis[x-1][y] = true;
						cnt++;
					}
					if(((y-1) >= 0 && arr[x][y-1]=='o' && !vis[x][y-1])) {
						iq.add(x);
						jq.add(y-1);
						vis[x][y-1] = true;
						cnt++;
					}
				}
				if(canKill && as.size()==1 && bs.size()==1) {
					int g = as.iterator().next();
					int h = bs.iterator().next();
					if(!vv.containsKey(g+" : "+h)){
						vv.put(g+" : "+h, 0);
					}
					vv.put(g+" : "+h, vv.get(g+" : "+h)+cnt);
					max = Math.max(max, vv.get(g+" : "+h));
				}
				if(as.size()==0 && bs.size()==0) {
					zeroC += cnt;
				}
				
			}
		}
		
		return freeSpace ? max + zeroC : 0;
	}
	

}
