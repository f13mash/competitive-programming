import java.util.Arrays;

public class FoxAndChess {

	public String ableToMove(String begin, String target) {
		char[] ab = begin.toCharArray();
		char[] at = target.toCharArray();
		
		int n = ab.length;
		int[] ind = new int[n];
		Arrays.fill(ind, -1);
		
		int i = 0, j = 0;
		while(i < n) {
			if(ab[i] == '.'){
				i++;
				continue;
			}
			
			while(j < n && at[j] == '.') {
				j++;
				continue;
			}
			
			if(j == n || ab[i] != at[j])
				return "Impossible";
			ind[i] = j;
			i++;
			j++;
		}
		
		while(j < n && at[j] == '.') {
			j++;
			continue;
		}
		
		if(j!=n)
			return "Impossible";

		for(i=0;i<n;i++) {
			if(ind[i] != -1 && !((ab[i] == 'L' && ind[i] <= i) || (ab[i] =='R' && ind[i] >=i)))
				return "Impossible";
		}
		
		return "Possible";
	}

}
