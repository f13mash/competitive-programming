import java.util.HashSet;

public class TopFox {

	public int possibleHandles(String familyName, String givenName) {
		HashSet<String> hs = new HashSet<String>();
		for(int i=1; i<=familyName.length(); i++){
			for(int j=1; j<=givenName.length(); j++){
				String str = familyName.substring(0, i) + givenName.substring(0, j);
				hs.add(str);
			}
		}
		return hs.size();
	}

}
