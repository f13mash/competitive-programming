import java.util.Arrays;

public class WolfDelaymasterHard {

	public int countWords(int N, int wlen, int w0, int wmul, int wadd, int olen, int o0, int omul, int oadd) {
		char[] arr = new char[N];
		Arrays.fill(arr, '?');
		
		long x = w0;
				
		for(int i=0;i<wlen;i++) {
			arr[(int) x] = 'w';
			x = (x*wmul + wadd) % N;
			
		}
		
		x = o0;
		for(int i=0;i<olen;i++) {
			arr[(int) x] = 'o';
			x = (x * omul + oadd);
		}
		
		
		int ws =0, os = 0;
		for (int i=0;i<N; i++) {
			if(ws == os)
				ws = os = 0;
			switch(arr[i]) {
			case 'w':
				if(os > 0)
					return 0;
				ws++;
				break;
			case 'o':
				os++;
				if(os > ws)
					return 0;
				break;
			case '?':
				
				break;
			}
		}

		return 0;
	}

}
