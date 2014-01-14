public class SearchBox {

	public int find(String text, String search, String wholeWord, int start) {
		
		if(wholeWord.compareTo("Y") == 0){
			text = text.replaceAll(" ", "#");
			text = '#'+text+'#';
			int ind = text.indexOf("#"+search+"#", start);
			return ind != -1 ? ind : -1;
		}
		else
			return text.indexOf(search, start);
	}

}
