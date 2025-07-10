// Climbing stairs using tablulation (bottom up Approach)
// Tc= O(N)

public class E34 {
    public static int countStairs(int n){
        int dp[]= new int[n+1];

        dp[0]=1;
       
        // Tabulation loop
          for(int i=1; i<=n ; i++){
            if(i==1){
             dp[i]=dp[i-1]; 
            }else{
            dp[i]= dp[i-1] + dp[i-2];
          }
        }
          return dp[n];
    }

    public static void main(String[] args) {
    
        int n=5;
        System.out.println(" Ways to Climbing stairs :"+ countStairs(n));
    }
}
