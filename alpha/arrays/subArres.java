package arrays;

public class subArres {
    public static void printing(int [] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j =i; j< arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                // System.out.println(arr[i] + arr[j]);
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,10};
        printing(arr);
    }
}
