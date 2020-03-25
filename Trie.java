import java.util.HashMap;

public class Trie {

	private TrieNode root;

	public Trie() {
		/**
	        *Setting the root node
                 */
		root = new TrieNode();
	}
                /**
	        *for inserting child
                 */
	public void insert(String word) {
		HashMap<Character, TrieNode> children = root.getChildren();
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			TrieNode node;
			/**
	                *If the child is already in the map then set the next children
                        */
			if(children.containsKey(c)) {
				node = children.get(c);
			} else { 
				/**
	                         *If the child is new then set it next to its root
                                 */
				node = new TrieNode(c);
				children.put(c, node);
			}
			children = node.getChildren();
                        /**
	                   *If this node is the end node then you can insert 
                         */
			if(i == word.length() - 1) {
				node.setLeaf(true);
			}
		}
	}
	         /**
	           *this is for searching children 
                 */

	public boolean search(String word) {
		HashMap<Character, TrieNode> children = root.getChildren();

		TrieNode node = null;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if(children.containsKey(c)) {
				node = children.get(c);
				children = node.getChildren();
			} else { 
				node = null;
				break;
			}
		}

		if(node != null && node.isLeaf()) {
			return true;
		} else {
			return false;
		}
	}

}
