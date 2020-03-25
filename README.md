# Trie_In_Java
>#### Trie is an efficient information retrieval data structure. A Trie is a tree in which each node has many children. The value at each node consists of 2 things:
* A character 
* A boolean to say whether this character represents the end of a word.
Tries are also known as Prefix Trees.
___
_Summery_

* I have created a class named TrieNode.java. The class TrieNode.java consists of 3 things:
* A character to hold the current character at this node.
* A map which holds all the children.
* A boolean variable to tell us whether this node or character represents the end of a word.
* Then I have created a class named  Trie.java. which handles 2 operations:
* Insert the characters of a word into the Trie.
* Search whether a word exists in  created Trie.

  * The insert method adds words into the Trie character by character.
    * Note: For the words having common prefixes, the common characters are added only once.

   * The search method searches whether all the characters in a word are present in subsequent nodes of the tree in the same order. 
      * Also, for the node of the last character in the word, its isLeaf should be set.
___      

