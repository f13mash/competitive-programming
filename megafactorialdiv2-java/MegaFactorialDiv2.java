import java.util.Arrays;

public class MegaFactorialDiv2 {

	int m = 0;
	boolean[][] vis = null;
	long mod = 1000000009;
	int[] h;
	public int countDivisors(int N, int K) {
		h = new int[N+1];
		vis = new boolean[N+1][K+1];
		m = N+1;
		eval(N,K);
		long ans = 1;
		for(int i=2;i<=N;i++){
			ans *= (1 + h[i]);
			ans %= mod;
		}
		return (int)ans;
	}
	
	public void eval(int n, int k){

		if(n == 0){
			vis[n][k] = true;
			return;
		}
		if(k == 0){
			vis[n][k] = true;
			factorize(n, k);
			return;
		}
		vis[n][k] = true;
		eval(n-1,k);
		eval(n, k-1);

	}
	
	public void factorize(int n, int k){
		int on = n;
		for(int i = 2; i <= n && n > 1; i++){
			int cnt = 0;
			while(n%i == 0){
				cnt++;
				n /= i;
			}
			//h[i] += cnt;
			h[i] += cnt;
			h[i] %= mod;

		}

	}

}
