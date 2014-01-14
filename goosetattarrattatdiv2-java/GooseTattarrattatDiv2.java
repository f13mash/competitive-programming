import java.util.Arrays;

public class GooseTattarrattatDiv2 {

	public int getmin(String S) {
		int[] c = new int[26];
		
		char[] arr = S.toCharArray();
		for(char v : arr) {
			c[v-'a']++;
		}
		Arrays.sort(c);
		return S.length() - c[25];
	}

}
