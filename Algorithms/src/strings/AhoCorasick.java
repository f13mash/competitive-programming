package strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AhoCorasick {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {

		List<String> dictWords = new ArrayList<String>();
		dictWords.add("a");
		dictWords.add("ab");
		dictWords.add("bc");
		dictWords.add("bca");
		dictWords.add("c");
		dictWords.add("caa");
		
		search("aa", dictWords);
		
	}
	
	public static void search(String text, List<String> dictWords) {
		System.out.println("generating tree . . . ");
		Node root = generateTree(dictWords);
		addFallbacks(root);
		System.out.println("adding fallback links . . . "+root.charMap.get('a').fallback.v);

		char[] arr = text.toCharArray();
		
		Node curr = root;
		
		for(int i = 0; i < arr.length; i++) {
			if(curr.getKey(arr[i]) != null) {

				curr = curr.getKey(arr[i]);
				Node t = curr;

				if(t.isTerminal)
					System.out.println(t.value);

				t = t.fallback;
				while(t.fallback != t) {
					if(t.isTerminal)
						System.out.println(t.value);
				}
			}
			else{
				if(curr == curr.fallback){ 
					continue;
				}
				else {
					i--;
					curr = curr.fallback;
				}
			}
		}
	}
	
	public static  Node generateTree(List<String> dictWords) {
		Node root = new Node((char) 0);
		
		root.setFallback(root);
		
		for(String word : dictWords) {
			char[] aw = word.toCharArray();
			Node cur = root;
			for(int i=0;i<aw.length; i++) {
				
				Node next = cur.getKey(aw[i]);
				if(next == null) {
					next = new Node(aw[i]);
					cur.addLink(next);
				}
				if(i == (aw.length - 1)) {
					next.isTerminal = true;
					next.value = word;
				}
				cur = next;
			}
		}
		
		return root;
	}
	
	public static void addFallbacks (Node root) {
		List<Node> lnodes = new ArrayList<Node>();
		
		root.setFallback(root);
		lnodes.add(root);
		
		
		while(lnodes.size() > 0) {
			Node proc = lnodes.get(0);
			lnodes.remove(0);
			
			Collection<Node> col = proc.getAllDownNodes();
			lnodes.addAll(col);
			for(Node n : col) {
				Node f = proc.fallback;
				while(f != f.fallback) {
					if(f.getKey(n.v) != null){
						f = f.getKey(n.v);
						break;
					}
					else {
						f = f.fallback;
					}
				}
				
				if(f == f.fallback && f.getKey(n.v) != null) {
					f = f.getKey(n.v);
				}
				if(f != n)
					n.setFallback(f);
				else
					n.setFallback(root);
			}
			
		}
	}
	
	public static class Node {
		char v = 0;
		boolean isTerminal = false;
		Node fallback = null;
		String value = null;
		
		private Map<Character, Node> charMap = new HashMap<Character, Node>();
		
		public Node(char v) {
			this.v = v;
		}
		
		public Node getKey(char v) {
			return this.charMap.get(v);
		}
		
		public void addLink(Node n) {
			this.charMap.put(n.v, n);
		}
		public void setFallback(Node n) {
			this.fallback = n;
		}
		public Node getFallback() { 
			return this.fallback;
		}
		public Collection<Node> getAllDownNodes() {
			return this.charMap.values();
		}
	}

}
