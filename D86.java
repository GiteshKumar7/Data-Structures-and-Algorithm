//Start with problem
//words[]={"apple","app","Mango","Man","woman"}
//prefix = app // output = true
// prefix=moon // output= false

public class D86 {
    public static class Node{
        Node Children[]= new Node[26];
        Boolean eow=false;
        public Node(){
            for(int i =0; i<26; i++){
                Children[i]=null;
            }
            
        }
    }

  public static Node root= new Node();

  // innsert function in trie data structure 
   public static void insert(String word){
      Node curr= root;
    for(int level=0; level<word.length(); level++){
        int idx=word.charAt(level)-'a';
        if(curr.Children[idx]==null){
            curr.Children[idx]=new Node();
        }
        curr= curr.Children[idx];
    }
       curr.eow= true;
   }

   public static boolean startWith(String prefix){
     Node curr= root;
     for(int i =0; i<prefix.length(); i++){
        int idx= prefix.charAt(i)-'a';
        if(curr.Children[idx]==null){
            return false;
        }
        curr=curr.Children[idx];
     }
      return true;
   }
    
    public static void main(String[] args) {
        String arr[]= {"apple","app","mango","man","woman"};
        String prefix2="app";
        String prefix1="moon";
    // taking innput
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
        
    }
}
