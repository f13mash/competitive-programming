import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SpaceWarDiv2 {

	public int minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, int[] enemyCount) {
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		for(int i=0;i<enemyStrength.length; i++){
			if(!mp.containsKey(enemyStrength[i])){
				mp.put(enemyStrength[i], 0);
			}
			mp.put(enemyStrength[i], mp.get(enemyStrength[i]) + enemyCount[i]);
		}
		
		Integer[] keys = new Integer[mp.size()];
		mp.keySet().toArray(keys);
		
		Arrays.sort(keys);
		
		Arrays.sort(magicalGirlStrength);
		
		Map<Integer, Integer> killers = new HashMap<Integer, Integer>();
		
		for(int i=0;i<keys.length; i++){
			int f = -1;
			
			for(int j = 0; j< magicalGirlStrength.length; j++){
				if(magicalGirlStrength[j] >= keys[i]){
					f = j;
					break;
				}
			}
			if(f == -1)
				return -1;
			killers.put(keys[i], magicalGirlStrength.length - f);
		}
		
		int free = 0;
		int max = 0;
		int last = 0;
		
		for(int i = keys.length - 1; i >= 0; i --){
			int kc = killers.get(keys[i]);
			
			int nkc = kc - last;
			
			int tokill = mp.get(keys[i]);
			
			int ltk = tokill - nkc*max;
			
			if(ltk < 0){
				free += -ltk;
			}
			else
				if(ltk == 0){
				}
				else{
					if(ltk <= free){
						free -= ltk;
					}
					else{
						ltk -= free;
						free = 0;
						int add = (ltk / kc);
						if(ltk % kc != 0){
							add += 1;
							free = kc - ltk % kc;
						}
						max += add;
					}
				}
			
			last = kc;
		}
		
		return max;
	}

}
