package arrays;

public class binarySearch {
    public static int bisearch(int [] arr, int key) {
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        
        while(start <= end){
            
            
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid] < key) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3,13,35,68,80,90,100,345};
        System.out.println(bisearch(arr, 4));
    }
}
