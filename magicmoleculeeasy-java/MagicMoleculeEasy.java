import java.util.*;

public class MagicMoleculeEasy {

	int[] mp;
	boolean[][] bmb;
	int k, n;
	int ans = -1;
	long correction = 0;
	long des = 0;
	public int maxMagicPower(int[] mp, String[] mb, int k) {
		this.mp = mp;
		this.bmb = new boolean[mb.length][mb[0].length()];
		this.n = mp.length;
		this.k = k;
		
		for(int i=0;i<mb.length;i++){
			int cor = 0;
			for(int j=0;j<mb[i].length();j++){
				if(mb[i].charAt(j) == 'Y'){
					bmb[i][j] = true;
					cor = 1;
				}
			}
			if(cor == 1){
				des |= ((long) 1 << i);
			}
		}
		eval(0, 0, 0, 0);
		//System.out.println("state : "+Long.toBinaryString(des));

		return ans;
	}
	
	public void eval(int i, int j, int c, long state)
	{
		if(c > k){
			return;
		}
		if(j == i){
			j = 0;
			i++;
		}
		if(i == n){

			int[] extra = new int[n-c];
			int base = 0;

			for(int x=0;x<n;x++){
				if(( state & ((long)1 << x) ) > 0){
					base += mp[x];
				}
				else{
					if(extra[0] < mp[x]){
						extra[0] = mp[x];
						Arrays.sort(extra);
					}
				}
			}
			for(int x=0; x< extra.length;x++){
				base += extra[x];
			}
			ans = Math.max(base, ans);
			return;
		}
		
		if(bmb[i][j]){
			boolean iSet = ( state & ((long)1 << i) ) > 0;
			boolean jSet = ( state & ((long)1 << j) ) > 0;
			if(iSet && jSet){
				eval(i, j+1, c, state);
			}
			else
				if(iSet || jSet){
					if(iSet){
						eval(i, j+1, c+1, state &((long)1 << j));
					}
					else{
						eval(i, j+1, c+1, state &((long)1 << i));
					}
					eval(i, j+1, c, state);

				}
				else{
					eval(i, j+1, c+1, state &((long)1 << j));
					eval(i, j+1, c+1, state &((long)1 << i));
					eval(i, j+1, c, state);

				}
		}
		else{
			eval(i,j+1,c,state);
		}
	}
}
