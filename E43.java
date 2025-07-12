// Longest commoon subsequences  (LCS)

public class E43 {
    public static int  Lcs(String str1, String str2, int n , int m){
        if(n== 0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1)== str2.charAt(m-1)){ // same
           return Lcs(str1, str2, n-1, m-1)+ 1;
        }else{                    // differ last character
           int ans1= Lcs(str1, str2, n-1, m);
           int ans2= Lcs(str1, str2, n, m-1);
           return Math.max(ans1, ans2);            
        }
    }
  
    public static void main(String[] args) {
        String str1= "abcde";
        String str2="ace";
          
        // ans = 3
        System.out.println("Longest common subsequence : " + Lcs(str1, str2,str1.length(), str2.length()));
    }
}
