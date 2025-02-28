public class Solution {

    public static String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        // dp array to store the length of the longest common subsequence (LCS)
        int[][] dp = new int[m + 1][n + 1];
        
        // Fill dp array using dynamic programming approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Now reconstruct the shortest common supersequence
        StringBuilder res = new StringBuilder();
        int i = m, j = n;
        
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                res.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                res.append(str1.charAt(i - 1));
                i--;
            } else {
                res.append(str2.charAt(j - 1));
                j--;
            }
        }
        
        // Add remaining characters of str1 or str2
        while (i > 0) {
            res.append(str1.charAt(i - 1));
            i--;
        }
        
        while (j > 0) {
            res.append(str2.charAt(j - 1));
            j--;
        }
        
        // Since we built the result in reverse, we need to reverse it at the end
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        
        System.out.println("Shortest Common Supersequence: " + shortestCommonSupersequence(str1, str2));
    }
}
