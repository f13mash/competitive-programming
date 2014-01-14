import java.util.Arrays;
import java.util.Comparator;

public class SpaceWarDiv1 {

	public long minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, long[] enemyCount) {
		int en = enemyStrength.length;
		H[] enemies=  new H[en];
		for(int i=0;i<en;i++) {
			enemies[i] = new H(enemyStrength[i], enemyCount[i]);
		}
		
		Arrays.sort(enemies, new Comparator<H>() {

			public int compare(H o1, H o2) {
				return o1.s - o2.s;
			}
		});
		Arrays.sort(magicalGirlStrength);
		int mn = magicalGirlStrength.length;
		long[] capacity = new long[mn];
		int l = 0;
		for(int i=0;i<mn ;i++) {
			if(enemyStrength[l] <= magicalGirlStrength[i] && l < en){
				capacity[i] = enemyCount[l];
				l++;
			}
			if(i > 0) {
				capacity[i] += capacity[i-1];
			}
			System.out.println(capacity[i]);
		}
		
		long[] dist = new long[mn];
		for(int i = 0;i<mn ; i++) {
			if(i!=(0)) {
				dist[i] = capacity[i]-capacity[i-1]; 
			}
			else {
				dist[i] = capacity[i];
			}
		}
		int max = 0;
		long avail = 0;
		for(int i= mn-1;i>=0;i--) {
			long desAvg = capacity[i]/(i+1);
			long rem = capacity[i]%(i+1);
			
		}
		return 0;
	}
	
	class H {
		int s;
		long c;
		public H(int s, long c) {
			this.s = s;
			this.c = c;
		}
	}

}
