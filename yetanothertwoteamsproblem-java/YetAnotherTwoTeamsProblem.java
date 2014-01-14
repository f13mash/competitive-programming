import java.util.Arrays;

public class YetAnotherTwoTeamsProblem {

	int n;
	long[] sum = null;
	int[] skill;
	long ans = 0;
	public long count(int[] skill) {
		
		Arrays.sort(skill);
		this.skill = skill;
		n = skill.length;
		
		sum = new long[n+1];
		
		for(int i=n-1;i>=0;i--){
			sum[i] = sum[i+1] + skill[i];
		}
		
		for(int i=0;i<n;i++) {
			
			long t1 = skill[i];
			long t2 = sum[0] - sum[i];
			long v = eval(skill[i], i + 1, t1, t2);
			ans += v;
		}
		
		return ans;
	}
	
	
	public long eval(int min, int curr, long t1, long t2) {
		if(curr == n) {
			if(t1 > t2 && (t1-min) < (t2 + min))
				return 1;
			else 
				return 0;
		}
		long lc = sum[curr];
		
		if(((lc+t1) <= t2) || (lc+t1-t2) <= (2*min))
			return 0;
		
		return (eval(min, curr+1, t1+skill[curr], t2) + eval(min, curr+1, t1, t2+skill[curr]));
		
	}

}
