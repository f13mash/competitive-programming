public class ShoutterDiv2 {

	public int count(int[] s, int[] t) {
		int n = s.length;
		boolean[] curr = new boolean[n];
		int ans = 0;
		int cnt = 0;
		for(int i=0;i<=100;i++){
			int in = 0;
			for(int j=0;j<n;j++){
				if(curr[j] || s[j] != i)
					continue;
				curr[j] = true;
				in ++;
			}
			int out = 0;
			for(int j=0;j<n;j++){
				if(!curr[j] || t[j] != i)
					continue;
				curr[j] = false;
				out ++;
			}
			ans += (in * cnt);
			ans += (in <= 1 ? 0 : (in*(in-1))/2);
			cnt += in;
			cnt -= out;
			
		}
		
		return ans;
	}

}
