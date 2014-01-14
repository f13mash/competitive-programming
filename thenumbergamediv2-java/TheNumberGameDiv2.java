public class TheNumberGameDiv2 {

	public int minimumMoves(int A, int B) {
		String sB = Integer.toString(B);
		String sA = Integer.toString(A);
		StringBuilder rSA = (new StringBuilder(sA)).reverse();
		String revA = rSA.toString();
		System.out.println(sA+" : "+sB+" : "+revA);
		int ans = Integer.MAX_VALUE;
		if(sA.contains(sB)) {
			if(sA.startsWith(sB)) {
				ans = Math.min(ans , (sA.length() - sB.length()));
			}
			else {
				ans = Math.min(ans, (1 + sA.length() - sB.length() + (sB.length() > 1 ? 1 : 0)));
			}
		}
	
		if(revA.contains(sB)) {
			ans = Math.min(ans, (1 + sA.length() - sB.length()));
		}
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

}
