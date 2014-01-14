import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LittleElephantAndArray {

	public int getNumber(long A, int N) {
		Map[] arr = new Map[N+1];
		for(int i=0;i<=N;i++) {
			long val =  A+i;
			char[] vArr = Long.toString(val).toCharArray();
			int skip = 0;
			arr[i] = new HashMap<Long, Integer>();
			eval(vArr, val ,arr[i], 0, 0);
		}
		Map<Long, Integer> ans = new HashMap<Long, Integer>();
		for(int i=0;i<=N;i++) {
			Map<Long, Integer> nans = new HashMap<Long, Integer>();
			if(i==0) {
			Long[] sort = (Long[]) ans.keySet().toArray();
			Arrays.sort(sort);
			int prev = 0;
			for(int j=0;j<sort.length;j++) {
				nans.put(sort[j], (int) ((Integer)arr[i].get(sort[j]) + prev));
				prev = nans.get(sort[j]);
			}
			}
			else {
				
			}
		}
		return 0;
	}
	
	public void eval(char[] vArr, long val, Map<Long, Integer> states, int in, int skip) {
		if(in == vArr.length) {
			int s = skip;
			long a = 0;
			for(int i=0;i<vArr.length;i++) {
				if((skip & (1 <<i)) == 0) {
					a*=10;
					a+=(vArr[i]-'0');
				}
			}
			if(!states.containsKey(a)) {
				states.put(a, 0);
			}
			states.put(a, states.get(a)+1);
			return;
		}
		eval(vArr, val, states, in+1, skip|(1<<in));
		eval(vArr, val, states, in+1, skip);
	
	}
	
	

}
