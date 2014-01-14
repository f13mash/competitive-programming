import java.util.Arrays;

public class ShuffleSort {

	public double shuffle(int[] cards) {
		Arrays.sort(cards);
		int n = cards.length;
		int[] cnt = new int[n];
		double[] ans = new double[n];
		ans[n-1] = 1;
		for(int i=n-1;i>=0;i--){
			if(i < (n-1) && cards[i] == cards[i+1]){
				cnt[i] = cnt[i+1] + 1;
			}
			else{
				cnt[i] = 1;
			}
			
			if(i <(n-1)){
				ans[i] = ((double)(n - i)/cnt[i] + ans[i + 1] - 1);
			}
			else
				continue;
			
		}
		return ans[0];
	}

}
