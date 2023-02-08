package arrays;

public class normalStock {
    public static int profit(int [] arr) {
        int bp = Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0; i<arr.length;i++){
            if(bp < arr[i]){
                int profit = arr[i]-  bp;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                bp = arr[i];
            }
        }
        return maxProfit;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,4};
        System.out.println(profit(arr));
    }
}
