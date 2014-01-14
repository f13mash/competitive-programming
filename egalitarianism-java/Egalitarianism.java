import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Egalitarianism {

	int n, d;
	
	int[][] mp = null;
	public int maxDifference(String[] isFriend, int d) {
		int n = isFriend.length;
		
		int[][] dis = new int[n][n];
		
		for(int i=0;i<n;i++) {
			char[] arr = isFriend[i].toCharArray();
			for(int j=0;j<n;j++) {
				if(arr[j] == 'Y') {
					dis[i][j] = 1;
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(dis[j][i] > 0 && dis[i][k] > 0) {
						if(dis[j][k] == 0 || dis[j][k] > (dis[j][i] + dis[i][k]))
							dis[j][k] = dis[j][i] + dis[i][k];
					}
				}
			}
		}
		int max = -1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				if(dis[i][j] == 0)
					return -1;
				max = Math.max(dis[i][j], max);
			}
		}
		return max*d;
	}
	

}
