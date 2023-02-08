package DP;



public class CatalansNo {
    public static int catNo(int n){
        if(n == 1 || n == 0){
            return 1; 
        }
        int dp[] = new int[n+1]; 
        int ans = 0; 
        if(dp[n] != 0){
            return dp[n]; 
        }
        for(int i= 0; i<n; i++){
            ans += catNo(i)*catNo(n-i-1); 
        }
        dp[n] = ans; 
        return ans; 
    }
    public static int catTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1; 
        dp[1] = 1; 

        for(int i= 2; i<dp.length; i++){
            for(int j= 0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1]; 
            }
        }
        return dp[n]; 
    }
    public static void main(String[] args) {
        System.out.println(catNo(4));
        System.out.println(catTab(4));
    }
}
