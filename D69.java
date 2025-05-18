// HashSet operation Implementation

import java.util.HashSet;
public class D69 {

    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();

        hs.add(111);
        hs.add(13);
        hs.add(33);
        hs.add(1);
        hs.add(9);
        hs.add(13);// duplicates values
        hs.add(111);// duplicates values

        System.out.println(hs);
          hs.remove(1);
          System.out.println(hs);
          System.out.println(hs.size());
          System.out.println(hs.isEmpty());
          hs.clear();

        if(hs.contains(111)){
            System.out.println("conatins 111");
        }

        // does not exist // false value  
        if(hs.contains(333)){
           System.out.println("Conatians 333");
        }
    }
}
