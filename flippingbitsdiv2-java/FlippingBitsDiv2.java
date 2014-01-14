import java.util.Arrays;

public class FlippingBitsDiv2 {

	public int getmin(String[] S, int M) {
		StringBuilder str = new StringBuilder();
		for(String t : S) {
			str.append(t);
		}
		char[] a1 = str.toString().toCharArray();
		char[] a2 = str.reverse().toString().toCharArray();
		int n = a1.length/M;
		int ret = Integer.MAX_VALUE;
		for(int i=0;i<=n;i++) {
			ret = Math.min(ret, getCostArr(a1, M, i) + getCostArr(a2, M, n-i));
		}
		return ret;
	}
	
	public int getCostArr(char[] arr, int M, int j) {
		int n = arr.length;
		int p1=0, p2=1;
		
		int[] sc = new int[n];
		for(int i=0;i<n;i++){
			if(arr[i] == '0')
				sc[i/M]++;
		}
		for(int i=j;i>0;i--) {
			int tp1 = Math.min(p1, p2+1)+sc[i-1];
			int tp2 = Math.min(p1+1, p2)+M-sc[i-1];
			p1=tp1;
			p2=tp2;
		}
		
		return Math.min(p1, p2);
	}

}
