package arrays;

public class linearSearch {
    public static int search(int[] arr,int n) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i]== n){
              return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {1,4,2,5,6,37,9};
        System.out.println(search(array, 10));
    }
}
