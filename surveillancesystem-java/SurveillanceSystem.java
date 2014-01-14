import java.util.Arrays;

public class SurveillanceSystem {

	public String getContainerInfo(String co, int[] re, int l) {
		char[] arr = co.toCharArray();
		int n = arr.length;
		int rl = re.length;
		boolean[][] watch = new boolean[rl][n];
		int[] rc = new int[rl];
		int[] counts = new int[n];
		
		
		Arrays.fill(counts, -1);
		Arrays.sort(re);
		
		int[] tst = new int[rl];
		for(int i =1; i<rl;i++){
			if(re[i] == re[i-1])
				tst[i] = tst[i-1];
			else
				tst[i] = i;
		}
		
		for(int j=0;(j+l-1) < n;j++){
			int sum = 0;
			if(j == 0){
				for(int i=0;i<l;i++){
					if(arr[i + j]=='X')
						sum++;
				}
				counts[j] = sum;
			}
			else{
				sum = counts[j - 1];
				if(arr[j - 1] =='X')
					sum--;
				if(arr[j + l - 1] == 'X')
					sum++;
				counts[j] = sum;
			}
		}
		double[] ans = new double[n];
		for(int i=0;i<rl;i++){
			int[] tmp = new int[n];
			for(int j = 0; (j + l - 1) < n; j++){
				if(counts[j] == re[i]){
					watch[i][j] = true;
					rc[i] ++;
					for(int k =0;k<l;k++){
						tmp[k + j]++;
					}
				}
			}
			
			for(int j = 0;j<n;j++){
				if(rc[i] == 0)
					continue;
				
				int ex = i - tst[i] ;
				for(int k = i+1;k<rl;k++){
					if(re[i] == re[k])
						ex ++;
				}
				
				ex +=1;
				
				if((tmp[j] - ex) > 0 &&  (rc[i] - ex) > 0 )
					ans[j] += ((double)(tmp[j])) / (rc[i] ) * (double)(i - tst[i]) / ex; 
			}

			System.out.println("ans "+Arrays.toString(tmp));
		}
		System.out.println("ans "+Arrays.toString(ans));
		String ret = "";
		for(int i =0; i < n; i++){
			if(ans[i] == 0){
				ret += '-';
			}
			else
				if(ans[i] < 1.0)
					ret += '?';
				else
					ret +='+';
		}
		
		return ret;
	}

}
