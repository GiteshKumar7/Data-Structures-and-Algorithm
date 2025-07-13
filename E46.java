//https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
//https://www.geeksforgeeks.org/problems/longest-common-substring1452/1
// longest common Substring

public class E46 {
    public static int LongestCommonSubstrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // 1.table creation
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;

        // 2. Innitialization
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // bottom up approach for longest common substring
        for (int i = 1; i < n + 1; i++) { // for string str1
            for (int j = 1; j < m + 1; j++) { // for Strinng str2
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;// continuity breaks , directly zero
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";// 2

        System.out.println("Longest Common Substrings :" + LongestCommonSubstrings(str1, str2));

    }
}
