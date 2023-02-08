

public class merge {
    public static void Merge(int [] arr, int s, int e, int mid) {
        int [] temp = new int[e -s+1];
        int i = s;
        int j = mid+1;
        int k=0;
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++]  = arr[i++];
        }

        while(j <= e){
            temp[k++] = arr[j++];
        }

        for(k = 0, i = s; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int [] arr, int s, int e) {
        int mid = (e-s)/2 + s;

        if (s >= e) {
            return;    
        }

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        Merge(arr, s, e, mid);
    }
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,6,8,2,3};
        mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
