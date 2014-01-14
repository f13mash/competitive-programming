public class SemiPerfectSquare {

	public String check(int N) {
		
		for(int i = 2; i <= N; i++){
			if(i*i <= N && N%(i*i) == 0 && (N / (i*i)) < i)
				return "Yes";
		}
		
		return "No";
	}

}
