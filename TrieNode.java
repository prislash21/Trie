import java.util.HashMap;
       
public class TrieNode {
	 /**
	 *Declaring Variable and a map to hold children
         */
	private char c;
	private HashMap<Character, TrieNode> children = new HashMap<>();
	private boolean isLeaf;

	public TrieNode() {}

	public TrieNode(char c){
		 /**
	        *Declaring character to hold the current character
                 */
		this.c = c;
	}

	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}    
           /**
	        *set a map for holding multiple characters
                 */
	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}

	public boolean isLeaf() {
		/**
	        *set for marking the end node
                 */
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
}
