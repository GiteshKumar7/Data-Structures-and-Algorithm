//https://leetcode.com/problems/intersection-of-two-arrays/description/
// 349. Intersection of Two Arrays
// union and intersection of two array

import java.util.*;

public class D74 {

    public static int Union(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();

        // putting the arr2 into the hashset
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        // putting the arr2 into the hashset
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        // System.out.println(hs);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        return hs.size();

    }
    

    public static int Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i]+ " ");
                hs.remove(arr2[i]);
                
            }
        }
      
        return count;

    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        System.out.println("Union : " + Union(arr1, arr2));
        System.out.println("Intersection : " + Intersection(arr1, arr2));

    }

}
