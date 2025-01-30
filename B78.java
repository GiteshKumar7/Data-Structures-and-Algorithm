//You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.Sample Input: 1947Sample Output: “one nine four seven
//Sample Input: 1947
//Sample Output: “one nine four seven”

public class B78 {
   
   // array of strings
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static String numberTowords(int num){
       
        // base case
        if( num==0){
            return " ";
        }

        // kaam
        String remainingDigit=numberTowords(num/10);
        
        int lastDigit= num%10;

        if(!remainingDigit.isEmpty()){
            return remainingDigit +" "+ digit[lastDigit];
       }else{
        return digit[lastDigit];
       }

    }

    public static String convertNumberToString(int num){
     if( num %10==0){
        throw new  IllegalArgumentException("the last digit of the number cant't be zero");
     }
     if(num==0){
        return "";
     }else{
        return numberTowords(num);
     }

    }
    public static void main(String[] args) {
        int num = 1941;
        String str = convertNumberToString(num);
        System.out.println(str);


        int num1 = 19411;
        String str1 = convertNumberToString(num1);
        System.out.println(str1);
    }
    
}
