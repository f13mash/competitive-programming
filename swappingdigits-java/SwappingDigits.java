import java.util.Arrays;

public class SwappingDigits {

	public String minNumber(String num) {
		char[] arr = num.toCharArray();
		for(int i=0; i<arr.length; i++){
			int f = arr[i];
			int swp = -1;
			for(int j = i+1; j < arr.length; j++){
				if(i == 0 && arr[j] == '0')
					continue;
				if(arr[j] <= f){
					swp = j;
					f = arr[j];
				}
			}
			if(swp != -1){
				char t = arr[i];
				arr[i] = (char) f;
				arr[swp] = t;
				break;
			}
		}
		
		return new String(arr);
	}

}
