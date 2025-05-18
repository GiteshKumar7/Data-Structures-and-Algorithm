//https://leetcode.com/problems/valid-anagram/submissions/1617575504/
// lc -> 242 Valid Anargram
// ab == ba (equal number of a and b)

import java.util.*;

public class D68 {

    public static boolean validAnargram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();

        // counting the frequencies using character in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // substracting the frequencies using the characer in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!hm.containsKey(ch)) {
                return false;
            } else {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }

            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        // for this case : It is valid anargram
        String s = "race";
        String t = "care";

        // // for this case : It is Not  valid anargram
        // String s= "tulip";
        // String t= "lipid";

        System.out.println(validAnargram(s, t));

    }

}
