public class JumpFurther {

	public int furthest(int N, int badStep) {
		int far = N*(N+1);
		far /= 2;
		for(int i=1;i<=N;i++) {
			int cnt = (i*(i+1))/2;
			if(cnt ==badStep){
				far--;
				break;
			}
		}
		return far;
	}

}
