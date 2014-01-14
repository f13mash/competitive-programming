package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SuffixArray {

	/**
	 * @param args
	 */
	public static int MAX = 26;
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getSuffixArray("bobocel")));
	}
	
	public static int[] getSuffixArray(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		int kMax = (int) Math.ceil(Math.log(n));
		
		int[] pos = new int[n];
		
		for(int i=0; i<n; i++) {
			pos[i] = arr[i] - 'a';
		}
		

		int[] newPos = new int[n];
		
		for(int k = 1; k <= kMax; k++) {

			for(int i = 0; i < n; i++) {
				int j = (int) (i + Math.pow(2, k-1));
				newPos[i] = (int) (pos[i]*Math.pow(26, k) + (j < n ? pos[j] : 0));
			}
			int[] temp = pos;
			pos = newPos;
			newPos = temp;
		}
		int[] posCopy = pos.clone();
		Arrays.sort(posCopy);
		
		int[] ret = new int[n];
		for(int i=0;i<n;i++){
			ret[i] = Arrays.binarySearch(posCopy, pos[i]);
		}

		return ret;
	}

}
