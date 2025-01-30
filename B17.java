// convert  firts letter of each wword to uppercase
// different companies

public class B17 {

   public static String  toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");

    char ch =Character.toUpperCase(str.charAt(0));
     sb.append(ch);

     for( int i =1; i<str.length(); i++){
        // agar empty space aatai tab and aa last tak chalna cahi if word possible 
       if(str.charAt(i) == ' ' && i<str.length()-1){ 
       sb.append(str.charAt(i));
       i++;
       sb.append(Character.toUpperCase(str.charAt(i)));
       }else{
        sb.append(str.charAt(i));
       }
     }

     return  sb.toString();

   }

public static void main(String[] args) {
    String str= "hi hello gitesh kumar";
    System.out.println(toUpperCase(str));

}
    
}
