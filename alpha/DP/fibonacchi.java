package DP;

//using memoisation
public class fibonacchi {
    public static int fib(int n, int f[]) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        for(int i =0 ; i<f.length; i++){
            System.out.print(f[i] + " ");
        }
        System.out.println();
        return f[n];
    }
    //using tabulation

    public static int fib1(int n, int f[]){
        f[0] = 0; 
        f[1] = 1; 
        for(int i = 2; i<f.length; i++){
            f[i] = f[i-1] + f[i-2]; 
        }
        return f[n]; 
    }
    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n+1];
        System.out.println(fib(n, f));
        // System.out.println(fib1(n, f));

    }
}
