// finding the max in an arraylist

import java.util.ArrayList;
public class C2 {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(111);
        list.add(22);
        list.add(333);
        list.add(321);
        list.add(2, 222);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

   // fromm reeversing to get the max value
        for (int i = list.size() - 1; i >= 0; i--) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

     // another way of getting the max value
        for (int i = list.size() - 1; i >= 0; i--) {
            max = Math.max(max, list.get(i));
        }

        // // or simply i can use for
        // for( int i =0 ; i<list.size(); i++){
        // if(max<list.get(i)){
        // max= list.get(i);
        // }
        // }

    // //    from revesing to get the min valur from the arraylist
    //     for (int i = list.size() - 1; i >= 0; i--) {
    //         if (min > list.get(i)) {
    //             min = list.get(i);
    //         }
    //     }

        for (int i = list.size() - 1; i >= 0; i--) {
           min =Math.min(max, list.get(i));
        }

        System.out.println("the maximumm among the arrayList :" + max);
        System.out.println("the minimum among the arrayList :" + min);
    }
}
