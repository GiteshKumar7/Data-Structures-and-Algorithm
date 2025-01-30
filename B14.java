// find the largest and smallest  string in  the given set of strings
// "mango" , "apple", "Banana";
//using LEXICOGRAPHIC  ORDER

public class B14 {
    public static String maxlexicographic(String str[]) {
        //
        String max = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].compareTo(max) > 0) {
                max = str[i];
            }
        }
        return max;
    }

  public static  String minlexicographic(String str[]) {
     String min= str[0];
     for( int i=0; i<str.length; i++){
        if(str[i].compareTo(min)<0){
          min = str[i];
        }
     }
     return min;
       
    }
    public static void main(String args[]) {
        // array of String
        String str[] = { "apple", "mango", "banana" };
        System.out.println("largest string in lexicographic :");
        String str1 = maxlexicographic(str);
        System.out.println(str1);

        System.out.println("Smallest string in lexicographic :");
         String str2= minlexicographic(str);
        System.out.println(str2);

    }

}
