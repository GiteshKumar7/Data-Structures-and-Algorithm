// Stock spam problem

import java.util.ArrayList;
import java.util.*;

public class C47 {
    // return type is arraylist<in>
    public ArrayList<Integer> calculateSpan(int arr[]){
   
   ArrayList<Integer> span= new  ArrayList<>();
  // stack initialization
  Stack<Integer> stack= new Stack<>();

  for(int i=0; i<arr.length; i++){
    
       while(!stack.isEmpty() && arr[stack.peek()] <=arr[i]){
      stack.pop(); // pop elements from stack which are smaller than current element
     }

     // calculate the span usinng the ternary operator
     int currentSpan= stack.isEmpty()? (i+1): (i-stack.peek());
    span.add(currentSpan);
    // push the current index onto the stack
    stack.push(i);
    }
    return span;
}

    public static void main(String[] args) {
        
        C47 c= new C47();
        int[]  prices ={100,80,60,70,60,75,85};

        
         ArrayList<Integer> spa = c.calculateSpan(prices);
      
        System.out.println("Stock prices: ");
        for( int price : prices){
            System.out.println(price + " ");
        }

        System.out.println("Stock values :");
        for(int value: spa){
            System.out.println(value + " ");
        }
   
    }

}
