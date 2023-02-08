
public class quick {



    public static int partition(int [] arr, int s, int e) {
        int poit = arr[e];
        int i = s-1;
        for(int j = s; j < e; j++){
            if(arr[j] <= poit ){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = poit;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int [] arr, int s, int e) {
        if (s > e) {
            return;
        }
        int pInx = partition(arr, s, e);
        quickSort(arr, s, pInx-1);
        quickSort(arr, pInx+1, e);
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3,6,2,9};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
