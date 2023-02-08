package DP;

public class miniumArrayJumps {
    public static int jumps(int arr[]){
        int n= arr.length; 
        int dp[] = new int[n]; 

        for(int i=0; i<dp.length; i++){
            dp[i] = -1; 
        }
        dp[n-1] = 0; 
        for(int i = n-2; i>= 0; i--){
            int steps = arr[i]; 
            int ans = Integer.MAX_VALUE; 
            for(int j= i+1; j<= steps+i && j<=n-1;j++ ){
                if(dp[j] != -1){
                    ans = Math.min(ans, dp[j] + 1); 
                }
            }
            if(ans != Integer.MIN_VALUE){
                dp[i] = ans; 
            }
        }
        return dp[0]; 

    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};    
        System.out.println(jumps(arr));
    }
}
