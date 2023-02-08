package Recursions;

public class searchRotated {
    public static int search(int [] arr, int s, int e, int k) {
        if(s > e){
            return -1;
        }
        int mid = (e+s)/2;
        
        if(arr[mid] == k){
            return mid;
        }

        else if(arr[s] <= arr[mid]){
            if (arr[s] <= k && k <= arr[mid]) {
                return search(arr, s, mid-1, k);
            }
            else{
                return search(arr, mid+1, e, k);
            }
        }
        else{
            if (k <= arr[e] && arr[mid] <= k ) {

                return search(arr, mid+1, e, k);

            }
            else{

                return search(arr,s, mid-1, k);

            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,1,2,3,4};
        int index = search(arr, 0, arr.length-1, 4);
        System.out.println(index);
    }
}
