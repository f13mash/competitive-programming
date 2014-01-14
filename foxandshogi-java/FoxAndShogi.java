import java.util.Arrays;

public class FoxAndShogi {

	public int differentOutcomes(String[] board) {
		int n = board.length;
		int w = board[0].length();
		char[][] arr = new char[n][];
		
		for(int i=0;i<n;i++) {
			arr[i] = board[i].toCharArray();
		}
		
		int[] limits = new int[w];
		int[] elemCount = new int[w];
		for(int j = 0;j<w;j++) {
			int s = 0, e = 0;
			boolean encUp = false;
			boolean encDown = false;
			for(int i=0;i<n;i++) {
				switch (arr[i][j]) {
				case '.':
					if(!encUp && encDown)
						e = i;
					break;

				}
			}
		}
		
		return 0;
	}

}
