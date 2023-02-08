package DP;

public class editString {
    public static int maxSteps(String s1, String s2){
        int n= s1.length(); 
        int m = s2.length(); 
        int dp[][] = new int[n+1][m+1]; 

        for(int i= 0; i<dp.length; i++){
            for(int j= 0; j<dp[0].length; j++){
                if(i == 0){
                    dp[i][j] = 0; 
                }if(j == 0){
                    dp[i][j] = 0; 
                }
            }
        }
        for(int i= 1 ;i<dp.length; i++){
            for(int j= 1; j<dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1; 
                }else{
                    int delete = dp[i-1][j] + 1; 
                    int insert = dp[i][j -1] + 1; 
                    dp[i][j] = Math.min(delete, insert); 
                }
            }
        }
        return dp[n][m]; 
    }
    public static void main(String[] args) {
        String s1 = "PEAR"; 
        String s2 = "SEA"; 
        System.out.println(maxSteps(s1, s2));
    }
}
