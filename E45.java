//https://leetcode.com/problems/longest-common-subsequence/
//https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1
// Longest Common Subsequences
// Tabulation (Bottom Up approach)
// Tc --> O(n*m)


public class E45 {

    public static int Lcs(String str1, String str2){
        int n =str1.length();
        int m= str2.length();

        // Table creation
        int dp[][]= new int[n+1][m+1];

        //Initialization (base case)
        for(int i=0; i< n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }


        // main code for Lcs
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                     dp[i][j]= dp[i-1][j-1]+1;
                }else{
                   int ans1= dp[i-1][j];
                   int ans2=dp[i][j-1];
                 dp[i][j]= Math.max(ans1, ans2); 
                   
                }
            }
        }
        System.out.println(lcString(str1,str2,dp));
     return dp[n][m];
       
    }

    // extra code for unnderstanding 
    public static String lcString(String str1, String str2,int dp[][]){
        int n = str1.length();
        int m= str2.length();

        int i=n, j=m;
        StringBuilder lcs= new StringBuilder();

        while(i>0 && j>0){
            if(str1.charAt(i-1)== str2.charAt(j-1)){
                lcs.append(str1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j] > dp[i][j-1]){
               i--;
            }else{
                j--; 
            }
        }

        return lcs.reverse().toString();
    }


    public static void main(String[] args) {
        String str1= "abcde";
        String str2="ace";

        System.out.println("Longest common Subsequence :" + Lcs(str1, str2));
    }
    
}
