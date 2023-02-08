package DP;

public class matrixChain {
    public static int minCost(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }

        int finalCost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = minCost(arr, i, k);
            int cost2 = minCost(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int cost = cost1 + cost2 + cost3;
            finalCost = Math.min(finalCost, cost);
        }
        return finalCost;
    }

    public static int minCostmemo(int arr[], int i, int j){
        if(i == j){
            return 0; 
        }
        int n = arr.length; 
        int dp[][] = new int[n][n]; 

        for(int a =0; a<dp.length; a++){
            for(int b = 0; b<dp[0].length; b++){
                dp[a][b] = -1; 
            }
        }
        
        if(dp[i][j] != -1){
            return dp[i][j]; 
        }
        int finalCost = Integer.MAX_VALUE; 
        for(int k = i; k<= j-1; k++){
            int cost1 = minCost(arr, i, k);
            int cost2 = minCost(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int cost = cost1 + cost2 + cost3;
            finalCost =  Math.min(finalCost, cost);
            dp[i][j] = finalCost; 
        }
        return finalCost; 
    }

    public static int minCostTab(int arr[]){
        int n = arr.length; 
        int dp[][] = new int[n][n]; 

        for(int len = 2; len<= n; len++){
            for(int i= 1; i<= n-len; i++){
                int j = len+i-1; 
                dp[i][j] = Integer.MAX_VALUE; 
                for(int k= i; k<=j-1; k++){
                    int cost1 = dp[i][k]; 
                    int cost2 = dp[k+1][j]; 
                    int cost3 = arr[i-1]* arr[k]*arr[j]; 
                    dp[i][j] = Math.min(dp[i][j], cost3 + cost2+ cost1); 
                }
            }
        }
        return dp[1][n-1]; 
    }
   
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n= arr.length; 
        System.out.println(minCost(arr, 1, n - 1));
        System.out.println(minCostmemo(arr, 1, n-1));
        System.out.println(minCostTab(arr));
    }
}
