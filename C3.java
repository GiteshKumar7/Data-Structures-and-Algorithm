// swap 2 numbers in arraylIst

import java.util.ArrayList;

public class C3 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) { // int[] arr
        int temp = list.get(idx1);

        // list.set(idx2, temp);
        // list.set(idx1, idx2);
     
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }  

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println("before swapping ");
        System.out.println(list);

        swap(list, idx1, idx2);

        System.out.println("after Swapping ");
        System.out.println(list);



    }
}
