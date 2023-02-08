package arrays;

import patterns.inHalfNum;

public class prefix {
    public static void prefixSum(int arr[]) {
        int currSum = 0;
        int masSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length]; 

        for(int i=1; i<prefixArray.length; i++){
            prefixArray[i] = arr[i] + prefixArray[i-1];
        }

        for(int i =0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                currSum = i ==0 ? prefixArray[j]: prefixArray[j] - prefixArray[i-1];

                if (masSum < currSum) {
                    masSum = currSum;
                }
            }
        }
        System.out.println(masSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6-1,3};
        prefixSum(arr);
    }
}
