package DP;

public class unboundedKnapsack {
    public static int maxProfit(int val[], int wt[], int wc) {
        int n = val.length;
        int dp[][] = new int[n + 1][wc + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < wc + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int w = wt[i - 1];
                int v = val[i - 1];
                if (w <= j) {
                    // int ans1 = v + dp[i - 1][j - w]; BoundedKnapsack(0_1)
                    int ans1 = v+ dp[i][j-w]; //Unbounded Knapsack
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][wc];
    }

    public static void main(String[] args) {
        int wt[] = { 2, 5, 1, 3, 4 };
        int val[] = { 15, 14, 10, 45, 30 };
        int w = 7;
        System.out.println(maxProfit(val, wt, w));
    }
}
