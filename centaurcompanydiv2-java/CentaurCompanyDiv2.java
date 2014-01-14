import java.util.*;

public class CentaurCompanyDiv2 {
	
	int n = 0;
	boolean[][] mp = null;
	long[] ans = null;
	
	public long count(int[] a, int[] b) {
		n = a.length + 1;
		mp = new boolean[n][n];
		ans = new long[n];
		
		for(int i=0;i<a.length;i++){
			mp[a[i]-1][b[i]-1] = mp[b[i]-1][a[i]-1] = true;
		}
		boolean[] st = new boolean[n];
		st[0] = true;
		eval(st, 0);
		long ret = 0;
		
		for(int i=0;i<ans.length;i++)
			ret += ans[i];
		
		return ret + 1;
	}
	
	public long eval(boolean[] st, int curr){
		long ret = 1;
		for(int i=0;i<st.length;i++){
			if(st[i] || !mp[curr][i] || curr == i)
				continue;
			st[i] = true;
			ret *= (1 + eval(st, i));
		}
		ans[curr] = ret;
		return ret;
	}
	
}
