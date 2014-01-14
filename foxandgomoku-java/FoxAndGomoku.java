public class FoxAndGomoku {

	public String win(String[] board) {
		int n = board.length;
		char[][] mp = new char[n][];
		int w = board[0].length();
		for(int i=0;i<n;i++) {
			mp[i] = board[i].toCharArray();
			if(board[i].contains("ooooo"))
				return "found";
		}
		
		for(int j=0;j<w;j++) {
			String str = "";
			for(int i=0;i<n;i++)
				str+=mp[i][j];
			if(str.contains("ooooo"))
				return "found";
			
		}
		int[][][] c = new int[n][w][2];
		for(int i=0;i<n;i++){
			for(int j=0;j<w;j++) {
				if(mp[i][j] == 'o') {
					int v1 = 0;
					if((i-1) >=0 && (j-1) >=0) {
						v1 = c[i-1][j-1][0];
					}
					int v2=0;
					if((i-1)>=0 && (j+1)<w) {
						v2 = c[i-1][j+1][1];
					}
					
					c[i][j][0] = v1+1;
					c[i][j][1] = v2+1;
					if(v1 >=4 || v2 >=4)
						return "found";
				}
			}
		}
		
		return "not found";
				
		
	}

}
