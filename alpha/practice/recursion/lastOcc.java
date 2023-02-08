package practice.recursion;

public class lastOcc {
    public static int last0c(int arr[], int i, int n){
        if(i == 0){
            return -1; 
        }
        if(n == arr[i]){
            return i; 
        }
        return last0c(arr, i-1, n); 
    }
    public static void main(String[] args) {
        int arr[] = {3,4,3,5,7,1,2,4,1};
        System.out.println(last0c(arr, arr.length-1, 4));
    }
}
