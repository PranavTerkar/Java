public class inseertionSort {

    public static void insertionSort(int [] arr) {
        for(int i =1; i<arr.length; i++){
            int curr= arr[i];
            int pre = i-1;
            while(pre>=0 && arr[pre] > curr){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] =curr;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,1,2};
        insertionSort(arr);
    }
}
