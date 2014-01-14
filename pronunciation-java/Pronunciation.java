public class Pronunciation {

	public String canPronounce(String[] words) {
		for(String w : words) {
			String nw = w.toLowerCase().replaceAll("([a]{2,})|([e]{2,})|([i]{2,})|([o]{2,})|([u]{2,})", "1");
			nw = nw.replaceAll("([a,e,i,o,u])", "2");
			nw = nw.replaceAll("([^123])", "3");
			if(nw.matches("(.*)([3]{3,})(.*)")){
				return w;
			}
			if(nw.matches("(.*)([2]{2,})(.*)")) {
				return w;
			}
			
		}
		return "";
	}

}
