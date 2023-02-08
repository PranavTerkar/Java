package practice.recursion;

public class power {
    public static int pow(int n, int x, int j) {
        if (j == 0) {
            return 1;
        }

        int dp[] = new int[j + 1];

        if (dp[j] != 0) {
            return dp[j];
        }

        dp[j] = pow(n, x, j - 1) * n;
        return dp[j];
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 4, 4));
    }
}
