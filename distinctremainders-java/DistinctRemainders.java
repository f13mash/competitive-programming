import java.util.ArrayList;
import java.util.List;

public class DistinctRemainders {

	int[][][] mem = null;
	
	public int howMany(long N, int M) {
		mem = new int[M+1][M+1][M*M];
		mem[0][0][0] = 1;
		for(int i = 0; i < M; i++){
			for(int j = 0; j <= M ; j++) {
				for(int k=0; k < M*M; k++) {
					if(mem[i][j][k] == 0)
						continue;
					mem[i+1][j][k] += mem[i][j][k];
					if(j < M)
						mem[i+1][j+1][k+i] += mem[i][j][k]; 
				}
			}
		}
		int m = (int) (N % M);
		long ans = 0;
		int mod = 1000000007;
		for(int k=0; k < M*M; k++){
			long Q = -1;
			if(m != (k % M)){
				continue;
			}
			Q = (N - k) / M;
			int i = M;
			long fact = 1;
			for(int j = 1; j <= M; j++){
				if(mem[i][j][k] == 0)
					continue;
				fact *= j;
				fact %= mod;
				long eval = eval(Q + j - 1, j - 1, mod) % mod;
				eval *= fact;
				eval %= mod;
				ans += eval;
				ans %= mod;
			}
		}
		
		return (int) ans;
	}
	
	public int eval(long C, int K, int mod){
		long kFact = 1;
		long[] arr = new long[K + 1];
		arr[0] = 1;
		for(int i=1; i <= K; i ++){
			arr[i] = C - i + 1;
		}
		for(int i = 1; i <= K; i ++){
			int f = i;
			int j = 1;
			while (f != 1) {
				for(int l = f; l > 1 && arr[j] >= l;){
					if(arr[j] % l == 0 && f % l == 0){
						f /= l;
						arr[j] /= l;
						l = f;
					}
					l--;
				}
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
