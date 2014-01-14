public class StringWeightDiv2 {

	int mod = 1000000009;
	public int countMinimums(int L) {
		if(L <= 26) {
			long val = combinations(26, L, mod);
			System.out.println(val);
			for(int i = 0; i < L; i++){
				val *= (i+1);
				val %= mod;
			}
			return (int) val;
		}
		
		long val = combinations(L - 1, 25, mod);
		for(int i = 0; i < 26; i++) {
			val *= (i + 1);
			val %= mod;
		}
		return (int) val;
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
