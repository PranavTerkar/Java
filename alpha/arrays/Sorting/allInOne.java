public class allInOne {

    public static void bubblesort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j+1]< arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int [] arr) {
        for(int i = 0; i<arr.length-1; i++){
            int smallPos = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[smallPos]) {
                    smallPos = j;
                }
            }
            int temp = arr[smallPos];
            arr[smallPos] = arr[i]; 
            arr[i] = temp; 
        }
    }
    public static void countingSort(int [] arr) {
        int large = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            large = Math.max(large, arr[i]);
        }
        int count[] = new int[large+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--; 
            }
        }
    }
    public static void printingArr(int [] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +  " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {4,6,1,9,3,6,5};
        // bubblesort(arr);
        countingSort(arr);
        // selectionSort(arr);
        printingArr(arr);
    }
}
