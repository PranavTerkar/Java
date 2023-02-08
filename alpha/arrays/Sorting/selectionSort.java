public class selectionSort {
    public static void selectionsort(int [] arr) {
        for(int i=0; i<arr.length-1; i++ ){
            int smallPos = i;
            for(int j =i+1 ; j<arr.length; j++){
                if (arr[smallPos] > arr[j]) {
                    smallPos = j;
                }
            }
            int temp = arr[smallPos];
            arr[smallPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,1,2};
        selectionsort(arr);
    }
}
