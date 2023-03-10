package DP;

import java.util.Arrays;
import java.util.*;

public class longestIncreasingSeq {
    public static int lis(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2);

        return lingestIncSeq(arr, arr2);
    }

    public static int lingestIncSeq(int arr[], int arr2[]) {
        int n = arr.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];

        // for (int i = 0; i < dp.length; i++) {
        //     dp[i][0] = 0;
        // }
        // for (int j = 0; j < dp[0].length; j++) {
        //     dp[j][0] = 0;
        // }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int arr[] = { 50, 3, 10, 40, 80 };
        System.out.println(lis(arr));
    }
}
 