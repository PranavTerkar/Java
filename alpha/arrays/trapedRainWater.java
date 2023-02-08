package arrays;

public class trapedRainWater {

    public static int trapedWater(int[] arr) {
        int n =arr.length;
        //LeftMax Boundry

        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        // RightMax Boundry

        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        //loop

        int trapedWater=0;
        for(int i =0; i<n; i++){
            //Waterlevel over ith bar
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //Traped water over ith bar
            trapedWater += waterLevel- arr[i];
        }
        return trapedWater;
    }


    public static void main(String[] args) {
        int [] height = {1,2,3,2,1};
        System.out.println(trapedWater(height));
    }
}
