import java.util.Arrays;

public class TravelOnMars {

	public int minTimes(int[] range, int startCity, int endCity) {
		int n = range.length;
		int[][] cost = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=range[i];j++) {
				cost[i][(i+j)%n] = 1;
				cost[i][(i-j)%n < 0 ? (n+(i-j)%n) : (i-j)%n] = 1;
			}
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(cost[j][i] == 0 || cost[i][k] == 0)
						continue;
					if(cost[j][k] == 0 || cost[j][k] > (cost[j][i] + cost[i][k]) )
						cost[j][k] = cost[j][i] + cost[i][k];
				}
			}
		}

		return cost[startCity][endCity];
	}
	

}
