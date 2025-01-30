//https://leetcode.com/problems/valid-parentheses/description/
//leetcode 20 valid parenthesis(Easy)
import java.util.*;
public class C52 {

    public static boolean isValidStr(String str){
   
       // stack creation for storing the string
        Stack<Character> s= new Stack<Character>();
 
     for(int i=0; i<str.length(); i++){
      char ch= str.charAt(i);// getting the character from the string

      if(ch=='(' || ch=='{'  || ch=='['){ // opening brackets
        s.push(ch);
      }else{
          if(s.isEmpty()){
            return false;
          }

          if((s.peek()== '(' && ch==')') ||   (s.peek() =='{' && ch=='}')  || (s.peek()=='[' && ch==']')){
            s.pop();
          }else{
            return false;
          }
        }
}

   if(s.isEmpty()){
    return true;
   }else{
    return false;
   }

}

    public static void main(String args[]){
     String str= "(){[]})";
     System.out.println(isValidStr(str));


    }
    
}
