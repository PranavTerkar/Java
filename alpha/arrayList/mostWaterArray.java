package arrayList;


public class mostWaterArray {
    public static void main(String[] args) {
        int arr [] = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0; 

        for(int i = 0; i< arr.length; i++){
            int area = 0;
            for(int j = 1; j< arr.length; j++ ){
                area  = Math.min(arr[i], arr[j]) * ((j-i)); 
                maxWater = Math.max(area, maxWater);
            }
            // System.out.println(area);
        }
        System.out.println(maxWater);
    }
}
