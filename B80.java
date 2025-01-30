//we are given a string , we need to find out the number of contigious substring starting and ending with same character

//  abcab =7
//abc= 4

public class B80 {

    // Main method to count contiguous substrings
    public static int countContSubstring(String str) {
        return countContigousSubstring(str, 0, 0);
    }

    // Helper recursive function to count substrings
    public static int countContigousSubstring(String str, int start, int end) {
        // Base case: if start index is greater or equal to the length of the string
        if (start== str.length()) {
            return 0;
        }

        // If end index is within bounds
        if (end < str.length()) {
            // If characters at start and end are the same, count it as a valid substring
            if (str.charAt(start) == str.charAt(end)) {
                return 1 + countContigousSubstring(str, start, end + 1);
            } else {
                // If characters are different, continue checking by incrementing end
                return countContigousSubstring(str, start, end + 1);
            }
        } else {
            // Move to the next starting character, reset end to start + 1
            return countContigousSubstring(str, start + 1, start + 1);
        }
    }

    public static void main(String[] args) {
        String input1 = "abcab";
        String input2 = "aba";

        System.out.println(countContSubstring(input1)); // Output: 7
        System.out.println(countContSubstring(input2)); // Output: 4
    }
}
