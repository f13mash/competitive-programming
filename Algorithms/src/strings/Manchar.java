package strings;

import java.util.Arrays;

public class Manchar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = prepareString("atssstb");
		applyManachar(arr);
	}

	public static char[] prepareString(String str) {
		char[] arr = str.toCharArray();
		
		char[] ret = new char[arr.length*2 + 3];
		for(int i=0;i<arr.length; i++) {
			ret[2*i + 2] = arr[i];
			ret[2*i + 3] = '#';
		}
		ret[ret.length - 1] = '^';
		ret[0] = '$';
		ret[1] = '#';
		return ret;
	}
	
	public static void applyManachar(char[] arr) {
		int[] val = new int[arr.length];
		
		int c = 0, r = 0;
		
		for(int i = 1; i < (arr.length - 1); i++) {
			int im = 2*c - i;
			val[i] = (r > i) ? Math.min(r - i, val[im]) : 0;
			System.out.println("i : "+i+" val : "+val[i]);

			while(arr[i + 1 + val[i]] == arr[i -1 -val[i]]){
				System.out.println("i : "+i+" val : "+val[i]);
				val[i]++;
			}
			
			if((i + val[i]) > r) {
				r = val[i] + i;
				c = i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(val));
	}
}
