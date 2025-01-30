// Remove Duplicates in a String

public class B73 {
    public static void removeDuplicates(String str, int idx , StringBuilder newstr,boolean[] map ){
  // basse case 
  if( idx== str.length()){
    System.out.println(newstr);
    return ;
      }

      char currChar = str.charAt(idx);
      if(map[currChar-'a']==  true){
        // duplicates
        System.out.print(currChar + " ");
        System.out.println();
        removeDuplicates(str, idx+1, newstr, map);
      }else{
        //no suplicates -> unique
        map[currChar -'a']=true;
         removeDuplicates(str, idx+1, newstr.append(currChar), map);
    }


  }

 public static void main(String args[]){
  String str ="appnnacollege";
  removeDuplicates(str,0,new StringBuilder(""),  new boolean[26]);



 }
    
}
