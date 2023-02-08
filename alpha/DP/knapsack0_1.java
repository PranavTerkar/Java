package DP;

public class knapsack0_1 {
    public static int fillBag(int val[], int wt[], int w, int x){
       if(w == 0 || x == 0){
        return 0; 
       }
       if(w >= wt[x-1] ){
            int ans1 = val[x-1]+ fillBag(val, wt, w-wt[x-1], x-1); 
            int ans2 = fillBag(val, wt, w, x-1); 
            return Math.max(ans1, ans2); 
       }else{
            return fillBag(val, wt, w, x-1); 
       }
    }
    public static int fillbagMemo(int val[], int wt[], int w, int x, int dp[][]){
        if(x == 0 || w == 0){
            return 0; 
        } 
        if(dp[x][w] != -1){
            return dp[x][w]; 
        }
        if(w >= wt[x-1]){
            int ans1 = val[x-1] + fillbagMemo(val, wt, w-wt[x-1], x-1, dp); 
            int ans2 = fillbagMemo(val, wt, w, x-1, dp); 
            dp[x][w] = Math.max(ans1, ans2); 
            return dp[x][w];   
        }else{
            dp[x][w] = fillbagMemo(val, wt, w, x-1, dp); 
            return dp[x][w]; 
        }
    }
    public static int fillbagTab(int val[], int wt[], int wc){
        int n= val.length; 
        int dp[][] = new int[n+1][wc+1]; 
        for(int i= 0; i<dp.length; i++){
            dp[i][0] = 0; 
        }
        for(int j= 0; j<dp[0].length; j++){
            dp[0][j] = 0; 
        }

        for(int i= 1; i<n+1; i++){
            for(int j =1; j<wc+1; j++){
                int v = val[i-1]; 
                int w = wt[i-1]; 
                 if(w<= j){
                    int inProfit = v + dp[i-1][j-w]; 
                    int exProfit  = dp[i-1][j]; 
                    dp[i][j] = Math.max(inProfit, exProfit); 
                }else{
                    int exProfit = dp[i-1][j]; 
                    dp[i][j] = exProfit; 
                }
            } 
        }
        return dp[n][wc]; 
    }

   public static void main(String[] args) {
    int wt[] = {2,5,1,3,4}; 
    int val[] = {15,14,10,45,30}; 
    int w = 7; 
    int dp[][] = new int[val.length+1][w+1]; 
    System.out.println(fillBag(val, wt, 7, val.length));
    for(int i = 0; i<dp.length; i++){
        for(int j= 0; j<dp[0].length; j++){
            dp[i][j] = -1; 
        }
    }
    System.out.println(fillbagMemo(val, wt, w, val.length, dp));
    System.out.println(fillbagTab(val, wt, w));
   }
}
