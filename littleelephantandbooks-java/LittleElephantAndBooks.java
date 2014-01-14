import java.util.Arrays;

public class LittleElephantAndBooks {

	public int getNumber(int[] pages, int number) {
		Arrays.sort(pages);
		int sum = 0;
		for(int i=0;i<(number-1);i++)
			sum += pages[i];
		sum+= pages[number];
		return sum;
	}

}
