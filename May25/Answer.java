class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[2][m + 1];
        
        for (int i = 1; i <= n; i++) {
            int cur = i & 1;
            int prev = cur ^ 1;

            for (int j = 1; j <= m; j++) {
                if (A[i-1] == B[j-1]) dp[cur][j] = dp[prev][j-1] + 1;
                else dp[cur][j] = Math.max(dp[cur][j-1], dp[prev][j]);
            }
        }
        
        return dp[n&1][m];
    }
}