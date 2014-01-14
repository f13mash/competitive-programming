import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GooseTattarrattatDiv1 {

	public int getmin(String S) {
		char[] arr = S.toCharArray();		
		int[] cnt = new int[26];
		int n = arr.length;
		Map<Character, List<Integer>> mp = new HashMap<Character, List<Integer>>();
		
		for(int i=0;i<n;i++) {
			cnt[arr[i]-'a']++;
			if(!mp.containsKey(arr[i])) {
				mp.put(arr[i], new ArrayList<Integer>());
			}
			mp.get(arr[i]).add(i);

			System.out.println("char : "+arr[i]+" : "+mp.get(arr[i]));
		}
		
		boolean[] vis = new boolean[26];
		
		int nc = 0;
		
		for(int i=0;i<26;i++) {
			if(vis[i])
				continue;
			if(!mp.containsKey((char)('a'+i)))
				continue;
			System.out.println("v : "+i);
			List<Integer> q = new ArrayList<Integer>();
			
			q.add(i);
			vis[i] = true;
			int bs = 0;
			
			while(q.size()>0) {
				int v = q.remove(0);
				bs = Math.max(bs, cnt[v]);
				if(!mp.containsKey((char)(v+'a')))
					continue;
				List<Integer> pos = mp.get((char)(v+'a'));
				for(int p : pos) {
					if(vis[arr[n-1-p]-'a'])
						continue;
					q.add(arr[n-1-p]-'a');
					vis[arr[n-1-p]-'a'] = true;
				}
			}
			nc += bs;
		}
		System.out.println(Arrays.toString(cnt));
		
		return n-nc;
	}

}
