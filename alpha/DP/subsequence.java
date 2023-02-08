package DP;

public class subsequence {
    public static int countSubSeq(String s1, String s2, int n, int m){
        if(n == 0 || m== 0){
            return 0; 
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return countSubSeq(s1, s2, n-1, m-1) + 1; 
        }else{
            int ans1 = countSubSeq(s1, s2, n-1, m); 
            int ans2 = countSubSeq(s1, s2, n, m-1); 
            return Math.max(ans1, ans2); 
        }
    }
    public static int countSubSeqMemo(String s1, String s2, int n ,int m){
       
        if(n == 0 || m == 0){
            return 0; 
        }
        int dp[][] = new int[n+1][m+1]; 

        for(int i= 0; i<dp.length; i++){
            for(int j= 0; j<dp[0].length; j++){
                dp[i][j] = -1; 
            }
           
        }
        if(dp[n][m] != -1){
            return dp[n][m]; 
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = countSubSeq(s1, s2, n-1, m-1) + 1; 
            return dp[n][m]; 
        }else{
            dp[n][m] = Math.max(countSubSeqMemo(s1, s2, n, m-1), countSubSeqMemo(s1, s2, n-1, m)); 
            return dp[n][m]; 
        }
    }
    public static int countSubSeqTab(String s1, String s2 ,int n, int m){
        int dp[][] = new int[n+1][m+1];

        for(int i= 1; i<dp.length; i++){
            for(int j= 1; j<dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1; 
                    System.out.print(s1.charAt(i-1) + " ");
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
                }
            }
        }
        return dp[n][m]; 
    }
    public static void main(String[] args) {
        String s1 = "abcdge"; 
        String s2 = "abcdg"; 
        // System.out.println(countSubSeq(s1, s2, s1.length(), s2.length()));
        // System.out.println(countSubSeqMemo(s1, s2, s1.length(), s2.length()));
        System.out.println(countSubSeqTab(s1, s2, s1.length(), s2.length()));
    }
}
