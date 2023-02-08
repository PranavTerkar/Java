package arrays;

public class subArraySum {
    public static void maxSum(int arr[]) {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                currSum = 0;
                for(int k = i; k<=j; k++){
                    currSum += arr[k]; 
                }
               
                // if(currSum > maxSum){
                //     maxSum = currSum;
                // }
                maxSum = Math.max(maxSum, currSum); 
            }
        }
        System.out.println(maxSum);
        
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        maxSum(arr);
    }
}
