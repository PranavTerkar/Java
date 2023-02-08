package DP;

public class miniumPartitioning {
    public static int minValue(int arr[]){
        int sum = 0 ; 
        for(int i= 0 ; i<arr.length; i++){
            sum += arr[i]; 
        }
        int w = sum/2; 
        int n = arr.length; 
        int dp[][] = new int[n+1][w+1]; 

        for(int i= 1; i<dp.length; i++){
            for(int j= 1; j<dp[0].length; j++){
                int v = arr[i-1]; 
                if(v<= j){
                    int in = v + dp[i-1][j-v]; 
                    int out = dp[i-1][j]; 
                    dp[i][j] = Math.max(in, out); 
                }else{
                    int out = dp[i-1][j]; 
                    dp[i][j] = out; 
                }
            }
        }
        int sum1 = dp[n][w]; 
        int sum2 = sum - sum1; 
        return Math.abs(sum2-sum1); 
    }
    public static void main(String[] args) {
        int arr[] = {1,6,11,5}; 
        System.out.println(minValue(arr));
    }
}