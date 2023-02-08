package Recursions;

public class fibonacci {

    public static int fiboSeries(int n ) {
        if (n == 0 || n == 1) {
            return n;
        }
     
        return (fiboSeries(n-1)+fiboSeries(n-2));
    }
    public static void main(String[] args) {
        System.out.println(fiboSeries(25));
    }
}
