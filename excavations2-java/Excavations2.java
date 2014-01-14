import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Excavations2 {
	int max = 51;
	int ans = 0;
	long mod = Long.MAX_VALUE;
	long[][] val;
	Map<Integer, Integer> mpCount = null;
	int ks;
	int[] found;
	public long count(int[] kind, int[] found, int K) {
		Arrays.sort(kind);
		Arrays.sort(found);
		this.found = found;
		max = kind.length +2;
		val = new long[max][max];
		
		 mpCount = new HashMap<Integer, Integer>();
		
		for(int i=0; i< kind.length; i++){
			if(!mpCount.containsKey(kind[i])){
				mpCount.put(kind[i], 0);
			}
			mpCount.put(kind[i], mpCount.get(kind[i]) + 1);
		}
		val[0][0] = 1;
		for(int i=1; i<max; i++){
			for(int j=0;j<=i; j++){
				if(j > 0){
					val[i][j] = val[i-1][j-1] + val[i-1][j];
				}
				else{
					val[i][j] = val[i-1][j];
				}
			}
			
			//System.out.println(Arrays.toString(val[i]));
		}
		
		ks = mpCount.size();
		long ans = recur(0, K);
		
		return ans;
	}
	
	
	public long recur(int ind, int avail){
		if(avail == 0 && ind == found.length)
			return 1;
		if(avail == 0)
			return 0;
		if(ind >= found.length)
			return 0;
		long ret = 0;
		for(int i = 1; i <= mpCount.get(found[ind]) && i<= avail ; i++ ){
			ret += val[mpCount.get(found[ind])][i] * recur(ind + 1, avail - i);
		}
		//System.out.println("at ind : "+ind+" : "+mpCount.get(found[ind])+" ret : "+ret+" av : "+avail);
		return ret;
	}
	
}
