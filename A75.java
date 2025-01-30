//  linear search code
// for String data types 
import java.util.*;

public class A75 {
  public static String  LinearSearch(String str[], String key){

    for(int i=0 ; i<str.length; i++){
        if(str[i]==key){
            System.out.println(key + "  --> element  found at index : " + i);
            return "found ";

        }
    }
    return "not found";

  }

    public static void main(String args[]){
       String str[] = { "samosa" , "idli", "sambar" , "pudina" }; // array of string
       
        String key = "pudina";

        String d=LinearSearch(str, key);
        if(d=="not found"){
            System.out.println("the String is not found in array of string");
       }else{
        System.out.println("the string is  "+ d);
       }

    }
}
