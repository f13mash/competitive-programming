import java.util.Arrays;

public class MountainsEasy {

	int peaks = 0;
	int cnt = 0;
	int mod = 1000000009;
	long[][] st;
	public int countPlacements(String[] picture, int N) {
		char[] prev = new char[picture[0].length()];
		for(int i=0;i<picture.length;i++){
			char[] arr = picture[i].toCharArray();
			for(int j=0;j<arr.length;j++){
				if(arr[j] == 'X' && ((j > 0 && prev[j-1] == 'X') || (j < (arr.length-1) && prev[j+1] == 'X') || prev[j] =='X') ){
					//continue;
				}
				else
					if(arr[j] == 'X')
						peaks ++;
				if(arr[j] == 'X')
					cnt ++;
			}
			prev = arr;
		}
		
		st = new long[N+1][cnt+1];
		Arrays.fill(st[0], 1);
		for(int i = 1;i<st.length;i++)
			Arrays.fill(st[i], -1);
		return (int) solve(N, cnt - peaks, peaks);
	}
	
	public long solve(int a, int notf, int fixed){
		
		if(a == 0 && fixed == 0)
			return 1;
		if(a == 0)
			return 0;
		
		if(st[a][fixed] != -1)
			return st[a][fixed];
		
		
		long ans = notf * solve(a - 1, notf, fixed);
		ans %= mod;
		if(fixed > 0)
			ans += fixed * solve(a-1, notf+1, fixed-1);
		
		ans %= mod;
		st[a][fixed] = (int) ans;

		return st[a][fixed];
	}

}
