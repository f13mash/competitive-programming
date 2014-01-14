import java.util.*;

public class Combinatorics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("test 50,2 "+ eval(50, 2, 1000000009) );
	}

	
	public static int eval(long C, long K, int mod){
		
		if(2*(long)K >= C){
			K = (int) (C - K);
		}
		
		if(K == 0)
			return 1;
		
		long kFact = 1;
		long[] arr = new long[(int)K + 1];
		arr[0] = 1;
		for(int i=1; i <= K; i ++){
			arr[i] = C - i + 1;
		}
		for(int i = 1; i <= K; i ++){
			int f = i;
			int j = 1;
			while (f != 1) {
				for(int l = f; l > 1;){
					if(arr[j] % l == 0 && f % l == 0 && arr[j] >= l){
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
	
	int combinations(int n, int k, int m) {
		
		long numer = 1, denom = 1;
		if(k > n)
			return 0;
		for(int i=1; i<=k; i++){
			numer = (numer * (n+1-i))%m;
			denom = (denom * i) % m;
		}
				
		return (int)(((long)numer*modInverse((int) denom, m)) % m);
		
	}
	
	/* This function calculates (a^b)%MOD */
	int pow(int a, int b, int MOD) {
	long x = 1, y = a;
	    while(b > 0) {
	        if(b%2 == 1) {
	            x=(x*y);
	            x%=MOD;
	        }
	        y = (y*y);
	        y%=MOD;
	        b /= 2;
	    }
	    return (int) x;
	}
	 
	int modInverse(int a, int m) {
	    return pow(a,m-2,m);
	}


}
