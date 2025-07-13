//https://leetcode.com/problems/longest-increasing-subsequence/
//https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1?utm_source=chatgpt.com
// Longest  Increasing subsequnces
// variation of LCS

import java.util.*;

public class E47 {
    public static int lcs(int arr1[], int arr2[]){
         int n= arr1.length;
         int m= arr2.length;
        int dp[][]= new int[n+1][m+1];// table creation

        // Initialization
        for(int i=0; i< n+1; i++){
            for(int j=0; j<m+1; j++){
               if(i==0  || j==0){
                dp[i][j]=0;
               }
            }
        }

        // Tablulation (bottom up approach)
          for(int i =1; i< n+1; i++){
           for(int j=1; j<m+1; j++){
             if(arr1[i-1]== arr2[j-1]){
                dp[i][j]= dp[i-1][j-1]+1;
             }else{
                int ans1= dp[i-1][j];
                int ans2= dp[i][j-1];
                dp[i][j]= Math.max(ans1,ans2);
             }
           }
          }
          return dp[n][m];
        }
    public static int LongestIncreaingSubsequnces(int arr1[]){
         

        HashSet<Integer> set = new HashSet<>();// Unique elements NO duplicate
        //  putting array elemnets into hashset
        for(int i=0 ; i< arr1.length; i++){
            set.add(arr1[i]);
        }

        // sorted , unique elements
        int arr2[]= new int[set.size()];//  capacity of hashset

        int i=0;
        for(int num : set){
            arr2[i]=num;
            i++;
        }

        Arrays.sort(arr2);//  sorting inn ascending order here of arr2
     
        return lcs(arr1,arr2);
    }
    
    public static void main(String[] args) {
       int arr1[]= {50,3,10,7,40,80};
       
       
       System.out.println("LongestIncreaingSubsequnces Length :   "+LongestIncreaingSubsequnces(arr1));
    }

}
