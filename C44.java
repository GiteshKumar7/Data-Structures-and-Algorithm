// push at the bottom of the stack

import java.util.*;
public class C44 {

    public static void pushAtBottomOfStack(Stack<Integer> s, int data){
        /// base case
        if(s.isEmpty()){
         s.push(data);
         return ;
        }
 
        int top=s.pop();
        pushAtBottomOfStack(s, data);
        s.push(top);
     }
     
public static void main(String[] args) {
    // stack creation using collection framework
    Stack<Integer> s= new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottomOfStack(s,0);
    
    // print until stack is empty
    while(!s.isEmpty()){
        System.out.println(s.pop()); //pop() means to print
    }
}
}
