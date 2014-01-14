public class TheArithmeticProgression {

	public double minimumChange(int a, int b, int c) {
		
		if((b-a) == (c-b))
			return 0.0;
		
		double d1 = Math.abs((b-(c-b)) - a);
		
		double d2 = Math.abs(a+(double)(c-a)/2 - b);
		double d3 = Math.abs(b + (b-a) - c);
		
		
		return Math.min(d1, Math.min(d2, d3));
	}

}
