// data copmression using stringBuilder
// aaabbbbrrrrrr= a3b4v5
//TC

public class B19 {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while ( i<str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();

    }

    public static void main(String args[]) {
        String str = "aaaabbcccddd";
        System.out.println(compress(str));

        String str2 = "abc";
        System.out.println(compress(str2));




    }

}
