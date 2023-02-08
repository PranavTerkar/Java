package practice.trees.recursion;

public class firseOcc {
    public static int occ(int arr[] , int k, int i){
        if(i == arr.length){
            return -1; 
        }

        if(arr[i] == k){
            return i; 
        }

        return occ(arr, k, i+1); 
    }
    public static void main(String[] args) {
        int arr[]= {1,3,4,2}; 
        System.out.println(occ(arr, 5, 0));
    }
}
