package DP;

public class editDistance {
    public static int maxSteps(String s1, String s2, int n, int m){
        int dp[][] = new int [n+1][m+1]; 
        for(int i= 0; i<dp.length; i++){
            for(int j= 0; j<dp[0].length; j++){
                if(i == 0){
                    dp[i][j] = j ; 
                }
                if(j == 0){
                    dp[i][j] = i; 
                }
            }
        }
        for(int i =1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] ; 
                }
                else{
                    int add = dp[i][j-1] + 1; 
                    int delete = dp[i-1][j] + 1; 
                    int replace = dp[i-1][j-1] + 1; 
                    dp[i][j] = Math.min(add, Math.min(delete, replace));   
                }
            }
        }
        for(int i= 0; i<dp.length; i++){
            for(int j= 0; j<dp[0].length; j++){
                System.out.print(dp[i][j] +  " ");
            }
            System.out.println();
        }
        return dp[n][m]; 
    }
    public static void main(String[] args) {
        String s1 = "intention"; 
        String s2 = "execution"; 
        System.out.println(maxSteps(s1, s2, s1.length(), s2.length()));
    }
}
