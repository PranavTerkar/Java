package arrays;

public class maxStock {

    public static void profit(int [] arr) {
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int x=0;
        int y =0;
        for(int i =0; i<arr.length;i++){
            if (arr[i] < min ) {
                min = arr[i];
                x =i;
            }
        }
        for(int i =0; i<arr.length;i++){
            if (arr[i] > max ) {
                max = arr[i];
                y =i;
            }
        }
        if(x > y){
            System.out.println("no max profit");
        }
        else{
            System.out.println(max-min);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,4};
        profit(arr);
    }
}
