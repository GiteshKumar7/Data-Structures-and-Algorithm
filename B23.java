
// check two string are anargams or not
import java.util.*;

public class B23 {

    // Anargams function
    public static boolean isAnargams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        //create a frequency array 
        int[] freuency1 = new int[26];
        int[] frequency2 = new int[26];

        // counting the frequency of each character in str1
        for (int i = 0; i < str1.length(); i++) {
            freuency1[str1.charAt(i) - 'a']++;
        }

        // counting the frequency of each character in str2
        for (int i = 0; i < str2.length(); i++) {
            frequency2[str2.charAt(i) - 'a']++;
        }

        // commpare of the frequency array
        for (int i = 0; i < 26; i++) {
            if (frequency2[i] != freuency1[i]) {// if any character founnd differ they are not anargams
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str1 = sc.nextLine();

        System.out.println("Enter the string :");
        String str2 = sc.nextLine();

        if (isAnargams(str1, str2)) {
            System.out.println("they are anargams ");
        }else{
            System.out.println("they are not anargams ");

        }

    }

}
