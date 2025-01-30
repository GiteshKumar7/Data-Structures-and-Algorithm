// multidimensional array in arraylist
// 1 2 3 4 5
// 2 4  6 8 10
// 3 6 9 12 15

import java.util.*;

public class C6 {
    public static void main(String arrgs[]) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // takinng input froom for loop
        for (int i = 1; i <=5; i++) {
            list1.add(i * 1); // 1 2 3 4 5
            list2.add(i * 2);// 2 4 6 8 10
            list3.add(i * 3);// 3 6 9 1 2 15

        }
      
        // // for not geting the index s aand 1 from list 1 and 3 respectively
        // list1.remove(3);
        // list3.remove(1);

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);

            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }

            System.out.println();
        }

    }

}
