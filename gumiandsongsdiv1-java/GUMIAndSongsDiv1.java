import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GUMIAndSongsDiv1 {

	public int maxSongs(int[] duration, int[] tone, int T) {
		
		int n = tone.length;
		int max = 0;
		
		Node[] arr = new Node[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Node(duration[i], tone[i]);
		}
		
		Arrays.sort(arr, new Comparator<Node>() {

			public int compare(Node o1, Node o2) {
				if(o1.t == o2.t)
					return o1.d - o2.d;
				return o1.t - o2.t;
			}
		});
		
		for(int i=0;i<n;i++) {
			for(int j = i; j < n; j++) {
				int t = T - (arr[j].t - arr[i].t);
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
				for(int k=i;k<=j;k++) {
					pq.add(arr[k].d);
				}
				
				int cnt = 0;
				
				while(pq.size() > 0 && (t - pq.peek()) >= 0) {
					cnt++;
					t -= pq.poll();
				}
				max = Math.max(cnt, max);
			}
		}
		
		return max;
	}
	
	
	public class Node {
		int d, t;
		
		public Node(int d, int t) {
			this.d = d;
			this.t= t;
		}
	}
	

}
