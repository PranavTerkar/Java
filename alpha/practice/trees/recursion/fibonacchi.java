package practice.trees.recursion;

public class fibonacchi {
    public static int fibo(int n ){

        if(n == 1 || n == 0){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
