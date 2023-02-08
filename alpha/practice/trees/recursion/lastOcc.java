package practice.trees.recursion;

public class lastOcc {
    public static int Occ(int arr[], int k, int i ){
        if(i == arr.length){
            return -1;
        }

        int isFound = Occ(arr, k, i+1); 
        if(isFound == -1 && arr[i] == k){
            return i; 
        }

        return isFound ; 


    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,2}; 
        System.out.println(Occ(arr, 2, 0));
    }
}
