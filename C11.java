// pair sum 2
// Directly Two pointer approach -> 0(n)

import java.util.*;

public class C11 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int bp = -1; // breaking point
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) { // breaking point
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest value
        int rp = bp; // largest value

        while (lp != rp) {
            // case 1
            if ((list.get(lp) + list.get(rp)) == target) {
                return true;
            }
            // case 2
            if ((list.get(lp) + list.get(rp)) > target) {
                rp = (list.size() + rp - 1) % list.size();
            }

            // case 3 
            if ((list.get(lp) + list.get(rp)) < target) {
                lp = (lp + 1) % list.size();
            }

        }
        return false;

    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        // 11,15,6,8,9,10 ->Sorted and rotated

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 100;

        System.out.println(pairSum(list, target));

    }

}
