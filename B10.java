// check if a String is a palinndrome or not 
//  madam, noon,racecar, moom

public class B10 {
    // function to check the palindroneness
    public static boolean ispalindrone(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        String str = "noon";
        boolean bool = ispalindrone(str);
        System.out.println(bool);

    }

}
