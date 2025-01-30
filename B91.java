// findinf all possible permutation of the data

public class B91 {
    public static void findPermutation(String str, String ans){
    
        // Base case
        if(str.length()== 0){
            System.out.println(ans);
            return ;
        }
       
        // recursive case
        for(int i =0; i<str.length(); i++){
            // for getting the character at the ith index
           char curr = str.charAt(i);
           //for removing the alphabet after using it 
           // "abcde"=> "ab" + "de"= abde
           //"abcde"=> "abcde"-"c"="abde"
          String rest = str.substring(0,i)+str.substring(i+1);
           findPermutation(rest, ans + curr); 
        }
    }

    public static void main(String args[] ){

  findPermutation("abc","");

    }
}
