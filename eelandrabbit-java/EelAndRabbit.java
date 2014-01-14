import java.util.Arrays;

public class EelAndRabbit {

	int[] l, t;
	int n;
	int ans = 0;
	
	public int getmax(int[] l, int[] t) {
		this.l = l;
		this.t = t;
		this.n = l.length;
		
		boolean[] kil = new boolean[n];
		eval(kil, 0, 0);
		return ans;
	}
	
	public void eval(boolean[] kil, int cnt, int killCnt){
		//System.out.println("kil : "+Arrays.toString(kil)+" cnt "+cnt+" "+killCnt);
		if(cnt == 2){
			ans = Math.max(ans, killCnt);
			return;
		}
		for(int i = 0; i < n; i++){
			if(kil[i])
				continue;
			boolean[] tmp = kil.clone();
			tmp[i] = true;
			int killed = 1;
			for(int j=0;j<n;j++){
				if(tmp[j] || j == i)
					continue;
				if(t[i] >= t[j] && t[i] <= (t[j] + l[j])){

					tmp[j] = true;
					killed ++;	
				}
				else
					continue;
			}
			eval(tmp, cnt+1, killed + killCnt);
		}
		if(cnt == 1)
			eval(kil, 2, killCnt);
	}

}
