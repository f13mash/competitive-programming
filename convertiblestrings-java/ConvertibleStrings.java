import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertibleStrings {

	char[] ca, cb;
	int ret = Integer.MAX_VALUE;
	int n;
	public int leastRemovals(String A, String B) {
		
		ca = A.toCharArray();
		cb = B.toCharArray();
		
		n = ca.length;
		
		int[] fill = new int[9];
		Arrays.fill(fill, -1);
		eval(fill, 0);
		
		
		return ret;
	}
	
	public void eval (int[] fill, int curr) {
		if(curr == n) {
			int rem = 0;
			
			for(int i=0;i<n;i++) {
				int c = ca[i] - 'A';
				if(fill[c] == -1){
					rem++;
				}
				else {
					if(fill[c] != cb[i]) {
						rem++;
					}
				}
			}
			
			ret = Math.min(ret, rem);
			if(rem <= 9) {
				System.out.println(rem + " : "+Arrays.toString(fill));
			}
			return;
		}
		
		int cv = ca[curr] - 'A';
		if(fill[cv] != -1 && fill[cv] != cb[curr]) {
			int prev = fill[cv];
			List<Integer> indx = new ArrayList<Integer>();
			for(int i=0;i<fill.length;i++) {
				if(fill[i] == cb[curr]) {
					indx.add(i);
					fill[i] = -1;
				}
			}
			fill[cv] = cb[curr];
			eval(fill, curr+1);
			fill[cv] = prev;
			for(int idx : indx) {
				fill[idx] = cb[curr];
			}
		}
		if(fill[cv] == -1)
			fill[cv] = cb[curr];
		eval(fill, curr+1);
	}

}
