// finding the substring form string using starting index nad ending index
// using function

public class B13 {
    public static String findSubstring(String str, int si, int ei) {
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += str.charAt(i);
        }
        return substring;

    }

    public static void main(String args[]) {
        String str = "helloWorld";
       // one way of direct using the inbuilt function
        System.out.println(str.substring(0,4 ));
     
        // // another way of makinng the function and start finding the substring 
        //String rem = findSubstring(str, 0, 3);
        //System.out.println(rem);
    }

}
