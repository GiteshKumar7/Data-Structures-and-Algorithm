//First  Non repeating letter in a stream f characters

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class C68 {
    public static void firstNonRepeatingLetter(String str){
    
        Queue<Character> q= new LinkedList<>();// queue creation
        int freq[]=new int[26];// assuming only lowercase letters
       
       
        for(int i=0; i<str.length(); i++){
            q.add(str.charAt(i)); //  store  into the queue
            
            freq[str.charAt(i)-'a']++;// count the frequency of each charater
           
            while(!q.isEmpty() && freq[q.peek()-'a']> 1){
             q.remove();// >1 repeating character
           // q.poll();
            }
           
            if(q.isEmpty()){
                System.out.print(-1 +" ");
            }else{
                System.out.print(q.peek()+ " ");
            }
   
        //  return q.isEmpty() ? '-' : q.peek();
        }
       // System.out.println();
    }


    public static void main(String[] args) {
        String str="aabccxb";
       firstNonRepeatingLetter(str);
    }
}
