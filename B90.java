// findinng the possible subbsets of the given sets
public class B90 {

  public static void findSubset(String str ,String ans ,int i){
    // base case
    if(i==str.length()){
           if(ans.length()==0){
            System.out.println("null");
        }
     System.out.print(ans);
     return;
    }

    // recursion (kaam)
    // for yes
    findSubset(str, ans+str.charAt(i), i+1);
    //for no case 
    findSubset(str,ans,i+1);

  }

  public static void main(String args[]){
    String str = "abc";
 findSubset("abc", "", 0);

  }    

}
