package arrays;

public class lagestNum {

    public static int largest(int arr[]) {
        int large= Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]> large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,1,0,7,78};
        System.out.println(largest(arr));
    }
}
