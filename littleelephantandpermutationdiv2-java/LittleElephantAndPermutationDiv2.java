public class LittleElephantAndPermutationDiv2 {

	long[] fact = {0,1,2,6,24,120,720,5040,40320,362880,3628800,39916800};
	public long getNumber(int N, int K) {
		
		int[] init = new int[N];
		
		for(int i=0;i<N;i++) {
			init[i] = i+1;
		}
		int[] curr = new int[N];
		boolean[] used = new boolean[N];
		return eval(init, curr, 0, N, K, 0, used)*fact[N];
		
	}
	
	public long eval(int[] des, int[] curr, int in, int N, int K, int sum, boolean[] used) {
		if(in == N) {
			if(sum < K)
				return 0;
			else
				return 1;
		}
		
		long cases = 0;
		
		for(int i=0;i<N;i++) {
			if(used[i])
				continue;
			used[i] = true;
			curr[in] = i+1;
			cases += eval(des, curr, in+1, N , K, sum + (Math.max(des[in], curr[in])), used);
			used[i] = false;
		}
		
		return cases;
	}

}
