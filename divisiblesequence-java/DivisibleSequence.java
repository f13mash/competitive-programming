import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DivisibleSequence {

	int N, H;
	int mod = 1000000009;
	long ans = 1;
	
	
	public int count(int N, int H) {
		Map<Integer, Integer> primes = new HashMap<Integer, Integer>();
		
		int f = N;
		
		
		this.N = N;
		this.H = H;

		int k = 0;
		if(H <= 1)
			return 1;
		
		for(int i=2;i<=f;i++){
			while ( f%i == 0){
				if(!primes.containsKey(i))
					primes.put(i, 0);
				primes.put(i, primes.get(i)+1);
				f /= i;
				k++;
			}
		}
		
		Integer[] splits = primes.values().toArray(new Integer[primes.size()]);
		Arrays.sort(splits);
		//System.out.println(Arrays.toString(splits));
		
		int[] dp = new int[64];
		Arrays.fill(dp, -1);
		
		for(int i = 0; i< splits.length; i++) {
			long sum = 0;
			for(int j = 0; j <= splits[i]; j++){
				////System.out.out.println("j " + (H-2+j)+"  : "+j);
				int ans;
				if(dp[j] != -1){
					ans = dp[j];
				}
				else{
					ans = eval((long)H-2+j, j, mod);
					dp[j] = ans;
				}
					
				sum += ans;
				sum %= mod;
			}
			ans *= sum;
			ans %= mod;
		}
		
		return (int) ans;
	}
	
	public int eval(long C, long K, int mod){
		//System.out.println("k : "+K+"  :::  "+C);

		if(2*(long)K >= C){
			K = (int) (C - K);
		}
		if(K == 0)
			return 1;
		
		long kFact = 1;
		//System.out.println("k : "+K+"  :::  "+C);
		long[] arr = new long[(int)K + 1];
		arr[0] = 1;
		for(int i=1; i <= K; i ++){
			arr[i] = C - i + 1;
		}
		for(int i = 1; i <= K; i ++){
			int f = i;
			int j = 1;
			Arrays.sort(arr);
			while (f != 1) {
				int l = -1;
				for(l = f; l > 1 && arr[j] >= l;){
					if(arr[j] % l == 0 && f % l == 0){
						f /= l;
						arr[j] /= l;
						l = f;
					}
					l--;
				}
				if(l != 1)
					j++;
			}
		}
		long ans = 1;
		for(int i = 1; i <= K; i++){
			ans *= (arr[i] % mod);
			ans %= mod;
		}
		
		return (int)ans;
	}

}
