// lc -> 1858 Longest word with all prefixes
// lexicographically 

public class D88 {
    public static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // root class initialization
    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestword(Node root, StringBuilder temp) {

        if (root == null) {
            return;
        }

        // lecicographically
        for(int i =25; i>=0;i--){  // for apply 
        // for (int i = 0; i < 26; i++) { // // for apple 
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                // backtrack
                temp.deleteCharAt(temp.length() - 1);// backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        // makinng a trie data structures
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        // function calling
        longestword(root, new StringBuilder(""));

        System.out.println("Longest word with all prefixes: " + ans);

    }
}
