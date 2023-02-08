package practice.trees.recursion;



public class arrypoints {
    public static void occArray(int arr[] , int k , int i){
        if(i == arr.length){
            return; 
        }
        if(arr[i] == k){
            System.out.print(i + " ");
              
        }
        occArray(arr, k, i+1);  
    }

    public static void printarr(int arr[], int i){
        if(arr.length == i){
            return; 
        }

        System.out.print(arr[i] + " ");
        printarr(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2}; 
        // occArray(arr, 2, 0);
        printarr(arr, 0);
    }
}
