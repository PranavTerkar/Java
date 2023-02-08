package DP;

public class climbingStairs {
    public static int noOfWaysrec(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return noOfWaysrec(n - 2) + noOfWaysrec(n - 1);
    }

    // Memoization
    public static int noOfWaysmemo(int dp[], int n) {
        // if(n == 0 || n == 1 || n== 2 || n == 3){
        // return n;
        // this will give 0 ways for 0 stairs
        // }
        if (n == 0) {
            return 1;
        }
        if(n < 0){
            return 0; 
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = noOfWaysmemo(dp, n - 1) + noOfWaysmemo(dp, n - 2);
        return dp[n];
    }
    //Tabulation
    public static int noOfWayTab(int n, int dp[]){
        dp[0]  = 1;
        for(int i =1; i<dp.length; i++){

            if(i == 1){
                dp[i] = dp[i-1]; 
            }else{
                dp[i] = dp[i-1]+dp[i-2]; 
            }
        }
        return dp[n]; 
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        // System.out.println(noOfWaysrec(n));
        // System.out.println(noOfWaysmemo(dp, n));
        System.out.println(noOfWayTab(n, dp));
    }
}
