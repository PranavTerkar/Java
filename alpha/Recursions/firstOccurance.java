package Recursions;

public class firstOccurance {
    public static int search(int [] arr, int key , int i){
        if (i == arr.length-1) {
            return - 1;
        }
        if (arr[i] == key) {
            return i;
        }
        return search(arr, key, i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,50};
        System.out.println(search(arr, 3, 0));
    }
}
