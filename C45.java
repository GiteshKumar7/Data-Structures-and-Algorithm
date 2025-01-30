// reverse a string using a stack
// GfG
import java.util.*;
public class C45 {

    public static String reverseString(String str){
 
        // put it in the stack
        Stack<Character> s= new Stack<>();// stack creation
        int idx=0;
        while(idx<str.length()){
          s.push(str.charAt(idx));
          idx++;
       }

       StringBuilder result = new StringBuilder("");
       while(!s.isEmpty()){
        char top = s.pop();
        result.append(top);
       }

       return result.toString();
    }

    public static void main(String[] args) {
        
     String str = "a b c";
     String r= reverseString(str);

     System.out.println(r);

    }
}
