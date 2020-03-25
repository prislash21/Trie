public class Main {

	public static void main(String[] args) {
		
		Trie trie = new Trie();
		trie.insert("Prio");
		trie.insert("Priota");
		trie.insert("Prioo");
		trie.insert("rio");
		trie.insert("ta");
		boolean res = trie.search("Priota");
		System.out.println(res);
	}

}