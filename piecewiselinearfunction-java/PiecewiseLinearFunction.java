public class PiecewiseLinearFunction {

	public int maximumSolutions(int[] Y) {
		int n = Y.length;
		int best = 0;
		for(int i=0;i<n;i++) {
			int v = Y[i];
			int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
			for(int j=0;j<n;j++) {
				if((j+1) < n) {
					if((v > Y[j] && v < Y[j+1]) || (v > Y[j+1] && v < Y[j]))
						c1++;
					if(Y[j] == v && Y[j+1] == v)
						return -1;
				}
				if(Y[j] == v) {
					c4++;
					if((j-1) >= 0 && (j+1) < n) {
						if(Y[j-1] < v && Y[j+1] < v) {
							c2 += 2;
						}
						else
							if(Y[j-1] > v && Y[j+1] > v) {
								c3 += 2;
							}
							else {
								c2++;
								c3++;
							}
						
					}
					else {
						if((j-1) >= 0) {
							if(Y[j-1] < v)
								c2 ++;
							else
								c3++;
						}
						else
							if((j+1) < n) {
								if(Y[j+1] < v)
									c2 ++;
								else
									c3++;
							}
					}
				}
			}
			best = Math.max(best, c1 + Math.max(c4, Math.max(c2, c3)));

		}
		return best;
	}

}
