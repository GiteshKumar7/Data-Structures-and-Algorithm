// Multidimmensional Arrays in arrraylist

import java.util.*;

public class C5 {
    public static void main(String args[]) {
        // Declare the multidimensional ArrayList
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        // Create and add the first list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainlist.add(list1);

        // Create and add the second list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list2);
   
        // Directly 
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(mainlist);
        System.out.println();

        // Iterate and print each element of the multidimensional ArrayList
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i); // Get the current list
            for (int j = 0; j < currList.size(); j++) { // Corrected increment here
                System.out.print(currList.get(j) + " ");
            }
            System.out.println(); // Move to the next line after each inner list
        }

        // Print the entire multidimensional ArrayList
        System.out.println(mainlist);
    }
}
