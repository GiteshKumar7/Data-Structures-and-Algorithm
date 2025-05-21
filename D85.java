//prefix Problem
//arr[]={"zebra","dog","dove","duck"}
// outpput= {" z","dog","dov",,"du" }


public class D85 {
    // trie creation
    public static class Node {
        Node Children[] = new Node[26]; // value upto 'a' - 'z'
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                Children[i] = null;
            }
            freq=1;
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
            }else{
                curr.Children[idx].freq++;
            }
            curr = curr.Children[idx];// update the curr to curr.children
        }

        curr.eow = true;// set eow to true after placing
    }

   

    // word break functions
    public static void findPrefix(Node root, String ans) {
       if(root==null){
        return ;
       }

       if(root.freq==1){
        System.out.println(ans);
        return ;
       }

       for(int i =0; i<root.Children.length; i++){
           if(root.Children[i]!=null){
             findPrefix(root.Children[i], ans+ (char)(i+'a'));
           }
       }

    }

    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove" };

        // for insert function
    for(int i =0; i<arr.length; i++){
        insert(arr[i]);
    }


    // for prefix
    root.freq=-1;
     findPrefix(root, "");// allc ome in alphabetical order
   

    }

}
