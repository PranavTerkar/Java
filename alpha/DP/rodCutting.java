package DP;

public class rodCutting {
    public static int maxProfit(int length[], int price[], int cl){
        int n = price.length; 
        int dp[][] = new int[n+1][cl +1]; 

        // for(int i = 0; i<dp.length; i++){
        //     dp[i][0] = 0; 
        // }
        // for(int i =0; i<dp[0].length; i++){
        //     dp[0][i] = 0; 
        // }

        for(int i= 1; i<dp.length; i++){
            for(int j = 1; j<dp[0].length; j++){
                int p = price[i-1]; 
                int l = length[i-1]; 
                if(j>= l){
                    int inProfit = p + dp[i][j-l]; 
                    int exProfit = dp[i-1][j]; 
                    dp[i][j] = Math.max(inProfit, exProfit); 
                }else{
                    dp[i][j] = dp[i-1][j]; 
                }
            }
        }
        for(int i= 0; i<dp.length; i++){
            for(int j= 0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();

        }
        return dp[n][cl];
    }

    public static void main(String[] args) {
        int length[] ={1, 2, 3, 4, 5,  6, 7, 8}; 
        int price[] = {1, 5, 8, 9, 10,17,17,20}; 
        int rodLngth = 8; 
        System.out.println(maxProfit(length, price, rodLngth));
    }
}
// pamiumv5