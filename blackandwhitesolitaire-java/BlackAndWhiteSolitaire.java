import java.lang.reflect.Array;
import java.util.Arrays;

public class BlackAndWhiteSolitaire {

	public int minimumTurns(String cardFront) {
		char[] arr = cardFront.toCharArray();
		int bc[] = new int[2];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 'B'){
				bc[i%2] ++;
			}
		}
		
		int best = Integer.MAX_VALUE;
		
		int l2 = arr.length/2 ;
		int l1 = l2 + (arr.length%2);
		
		best = Math.min(best, l1 - bc[0] + bc[1]);
		System.out.println("arr : "+Arrays.toString(bc)+" ::::  "+best);
		best = Math.min(best, bc[0] + l2 - bc[1]);
		System.out.println("arr : "+Arrays.toString(bc)+" ::::  "+best);
		return best;
	}

}
