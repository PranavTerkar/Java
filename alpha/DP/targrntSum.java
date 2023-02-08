package DP;

public class targrntSum {
    public static boolean isPresent(int num[], int tar){
        int n= num.length; 
        boolean dp[][] = new boolean[n+1][tar+1]; 
        for(int i= 0; i<n+1; i++){
            dp[i][0] = true; 
        }

        for(int i=1; i<n+1; i++ ){
            for(int j= 1; j<tar+1; j++){
                int v = num[i-1]; 
                if(v<= j && dp[i-1][j-v] == true){
                    dp[i][j] = true; 
                } 
                else if(dp[i-1][j] == true){
                    dp[i][j] = true; 
                }
            }
        }
        return dp[n][tar]; 
    } 
    public static void main(String[] args) {
        int num[] = {4,2,7,1,3}; 
        int tar = 10; 
        System.out.println(isPresent(num, tar));
    }
}
