// https://leetcode.com/problemset/?page=1&search=duplicate+parentheses
// leetcode Duplicate parenth

import java.util.*;

public class C53 {

    public static boolean isDuplicate(String str) {

        // stack creation
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }

        }
        return false;

    }

    public static void main(String[] args) {
        String str1 = "((a+b))";/// true
        String str2 = "(a+b)";// false

        System.out.println(isDuplicate(str2));
    }
}
