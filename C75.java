//https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/0
// generate binary numbers for a given number N
import java.util.*;

public class C75 {
    public static ArrayList<String> GenerateBinaryNumbers(int n) {

        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < n; i++) {
           String temp=q.remove(); 
            ans.add(temp);

            q.add(temp + "1");
            q.add(temp + "0");

        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> str = GenerateBinaryNumbers(n);

        for (String st : str) {
            System.out.print(st + " ");
        }
        System.out.println();

    }
}
