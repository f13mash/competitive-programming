package strings;

import java.util.Arrays;

public class KMP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("kmp table : "+search("alphalbalpha", "alphaniolalphalbalphaba;pha"));
	}
	
	public static int[] getKMPTable(String str) {
		char[] arr = str.trim().toCharArray();
		int[] kmptable = new int[arr.length];
		
		for (int i=0;i<arr.length;i++) {
			if(i == 0){
				kmptable[0] = 0;
			}
			else {
				if(arr[i] == arr[kmptable[i-1]]) {
					kmptable[i] = kmptable[i-1] + 1;
				}
				else 
					kmptable[i] = 0;
			}
		}
		
		return kmptable;
	}
	
	public static int search(String key, String str) {
		int ret = -1;
		
		char[] aStr = str.toCharArray();
		char[] aKey = key.toCharArray();
		
		int[] kmptable = getKMPTable(key);
		int j = 0;
		for(int i = 0; i< aStr.length; i++) {
			
			int s = i;
			if(aStr[i] == aKey[j]) {
				j++;
			}
			else {
				if(j > 0) {
					j = kmptable[j-1];
					i--;
				}
			}
			
			if(j == aKey.length) {
				ret = s - j + 1;
				break;
			}
		}
		return ret;
	}

}
