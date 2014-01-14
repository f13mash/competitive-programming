import java.util.Arrays;

public class WallGameDiv2 {
	
	int[][] mp = null;
	int m,n;

	public int play(String[] costs) {
		m = costs.length;
		n = costs[0].length();
		
		mp = new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				char c = costs[i].charAt(j);
				if(c =='x')
					mp[i][j] = -1;
				else
					mp[i][j] = c - '0';
			}

		}
		
		int[][] tmp = new int[2][n];
		Arrays.fill(tmp[1], -1);
		tmp[1][0] = 0;
		for(int i=0;i<(m - 1);i++){
			int s = i % 2;
			int o = (s + 1) % 2;

			Arrays.fill(tmp[s], -1);
			for(int j = 0; j<n; j++){
				int res = -1;
				if(mp[i][j] == -1){
					continue;
				}
				for(int k=0;k<n;k++){
					if(tmp[o][k] == -1)
						continue;
					
					int a = j, b=k;
					if(j > k){
						a = k; b = j;
					}
					int cost = -1;
					for(int l = a; l <= b; l++){
						if(mp[i][l] == -1){
							cost = -1;
							break;
						}
						else{
							if(cost == -1)
								cost += 1;
							cost += mp[i][l];
						}
					}
					if(cost != -1)
						res = Math.max(res, tmp[o][k] + cost);

				}
				tmp[s][j] = res;
			}
		}

		int min = -1;
		
		for(int j = 0;j<n;j++){
			if(tmp[(m)%2][j] == -1 || mp[m-1][j] == -1)
				continue;
			min = Math.max(tmp[(m)%2][j] + mp[m-1][j], min);
		}
		
		
		return min;
	}

}
