package Recursions;

public class lastOccurance {
    public static int lastOcc( int [] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if (arr[i] == key && isFound == -1) {
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,78,5};
        System.out.println(lastOcc(arr, 5, 0));
    }
}
