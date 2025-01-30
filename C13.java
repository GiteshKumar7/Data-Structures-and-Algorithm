//leetcode 896 -> Monotonic incresing and monotonic decresing 
import java.util.*;
public class C13 {

    public static boolean isMonotonic(ArrayList<Integer> list) {
  
        // for edge case or base case
    if(list.size()==1){
        return true;
    }

        boolean isIncreasing = true;
        boolean isDecreaing = true;

        for (int i = 0; i < list.size()-1 ; i++) {
            if (list.get(i)> list.get(i + 1)) {
                isIncreasing = false;
            } else if (list.get(i)< list.get(i + 1)) {
                isDecreaing = false;
            }
        }

        return isIncreasing || isDecreaing;

    }

    public static void main(String args[]) {
        // monotonic increaing -> { 1,2,3,3,4}
        // Monotonic Decraing -> {4,3,3,2,1}

     ArrayList<Integer> list= new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(6);

        System.out.println(isMonotonic(list));

    }
}
