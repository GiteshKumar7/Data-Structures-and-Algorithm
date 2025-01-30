//string compression using  Sstring  
//aabbbddd= a2b3d3
// abc =raminn same

public class B18 {

    public static String compress(String str) {
  
        String newstr = "";

        for (int i = 0; i <str.length(); i++) {
            Integer count = 1;
        
            //check unti n-1 and check a == a+1 or not
            while ( i<str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += Integer.toString(count);
            }

        }
        return newstr;

    }

    public static void main(String args[]) {
        String str = "aaaabbcccddd";
        System.out.println(compress(str));

        String str2 = "abc";
        System.out.println(compress(str2));


    }

}
