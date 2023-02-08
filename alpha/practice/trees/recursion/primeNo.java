package practice.trees.recursion;

public class primeNo {
    public static void prime(int n){
        if(n <= 0){
            return; 
        }

        prime(n-1);
        // if(n%2 != 0){
        //     System.out.print(n + " ");
        // }
        System.out.print(n +  " ");
    }
    public static void main(String[] args) {
        prime(10);
    }
}
