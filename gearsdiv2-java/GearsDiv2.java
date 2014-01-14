import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GearsDiv2 {
	public int getmin(String Directions) {
		return eval(Directions.toCharArray());
	}
	
	public int eval(char[] arr) {
		int n = arr.length;
		T last = null;
		
		List<T> al = new ArrayList<GearsDiv2.T>();
		
		for(int i = 0; i < arr.length; i++) {
			if(last == null){
				last = new T(arr[i], 0);
				al.add(last);
			}
			if(last.type == arr[i])
				last.incCount();
			else {
				last = new T(arr[i], 1);
				al.add(last);
			}
		}
		
		if(al.size() > 1 && al.get(0).type == al.get(al.size()-1).type) {
			al.get(0).count = al.get(0).count + al.get(al.size()-1).count;
			al.remove(al.size()-1);
		}
		int rm = 0;
		
		for(T t : al) {
			rm += (t.count/2);
		}
		if(al.size() == 1 && al.get(0).count%2 != 0)
			rm += 1;
		return rm;
	}
	class T {
		char type;
		int count;
		public T(char c, int i) {
			
			this.type = c;
			this.count = i;
		}
		public void incCount() {
			count++;
		}
		
		
	}
}
