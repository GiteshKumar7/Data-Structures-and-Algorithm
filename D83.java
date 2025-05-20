//lc -> 139    word break problem
// tc -> O(l) linear time complexity

public class D83 {
    // trie creation
    public static class Node {
        Node Children[] = new Node[26]; // value upto 'a' - 'z'
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                Children[i] = null;
            }
        }
    }

    public static Node root = new Node(); // root node creation

    // insert function
    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.Children[idx] == null) { /// children == next
                curr.Children[idx] = new Node();// add a new node below to the root(curr)
            }
            curr = curr.Children[idx];// update the curr to curr.children
        }

        curr.eow = true;// set eow to true after placing
    }

    public static boolean search(String key) {
        Node curr = root; /// intialize curr to root
        for (int level = 0; level < key.length(); level++) { // run upto key
            int idx = key.charAt(level) - 'a'; // get index after a
            if (curr.Children[idx] == null) { // equal to 0 ,, false
                return false;
            }
            curr = curr.Children[idx];// update the curr to next if exists
        }

        return curr.eow == true;// found eow = true
    }

    // word break functions
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && (wordBreak(key.substring(i)))) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String arr[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        // for insert function
    for(int i =0; i<arr.length; i++){
        insert(arr[i]);
    }

    System.out.println(wordBreak("ilike"));// exists
    System.out.println(wordBreak("ilikesam"));//exists
    System.out.println(wordBreak("ilikesung"));// sung doesn't exist



    }

}
