import java.util.Arrays;
import java.util.Comparator;

public class KingSort {

	public String[] getSortedList(String[] kings) {
		Arrays.sort(kings, new Comparator<String>() {

			public int compare(String o1, String o2) {
				String[] ao1 = o1.split(" ");
				String[] ao2 = o2.split(" ");
				if(ao1[0].compareTo(ao2[0]) != 0)
					return ao1[0].compareTo(ao2[0]);
				int do1 = romanToDecimal(ao1[1]);
				int do2 = romanToDecimal(ao2[1]);
				return do1 - do2;
			}
		});
		return kings;
	}
	public static int romanToDecimal(java.lang.String romanNumber) {
	    int decimal = 0;
	    int lastNumber = 0;
	    String romanNumeral = romanNumber.toUpperCase();
	         /* operation to be performed on upper cases even if user enters roman values in lower case chars */
	    for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
	        char convertToDecimal = romanNumeral.charAt(x);

	        switch (convertToDecimal) {
	            case 'M':
	                decimal = processDecimal(1000, lastNumber, decimal);
	                lastNumber = 1000;
	                break;

	            case 'D':
	                decimal = processDecimal(500, lastNumber, decimal);
	                lastNumber = 500;
	                break;

	            case 'C':
	                decimal = processDecimal(100, lastNumber, decimal);
	                lastNumber = 100;
	                break;

	            case 'L':
	                decimal = processDecimal(50, lastNumber, decimal);
	                lastNumber = 50;
	                break;

	            case 'X':
	                decimal = processDecimal(10, lastNumber, decimal);
	                lastNumber = 10;
	                break;

	            case 'V':
	                decimal = processDecimal(5, lastNumber, decimal);
	                lastNumber = 5;
	                break;

	            case 'I':
	                decimal = processDecimal(1, lastNumber, decimal);
	                lastNumber = 1;
	                break;
	        }
	    }
	    return decimal;
	}

	public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	    if (lastNumber > decimal) {
	        return lastDecimal - decimal;
	    } else {
	        return lastDecimal + decimal;
	    }
	}
	
}
