package Recursions;

public class sum {
    public static int sumnOfNumbers(int n) {
        if(n == 1){
            return n;
        }
        return n + sumnOfNumbers(n-1); 
    }
    public static void main(String[] args) {
        System.out.println(sumnOfNumbers(3));
    }
}
