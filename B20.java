//count the number of lowercase vowel present in the input given by users
// suppose hello world as contain 3 lowercase vowels 

import java.util.*;
public class B20 {

   public static int  lowercaseVowel(String str){
    int count =0;

    for( int i=0 ; i< str.length(); i++){
 // converting string into each charcter using integer or iterating 
         char ch = str.charAt(i);// value of i into charcter into 
      if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
        count++;
      }

    }
     
  return count;
 
   }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
   
     System.out.println("Enter a String : ");
     String str= sc.nextLine();
    
     int ll=lowercaseVowel(str);
     System.out.println( ll);

    }
    
}
