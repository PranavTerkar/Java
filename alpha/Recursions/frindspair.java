package Recursions;

public class frindspair {
    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int single = pairing(n-1);

        int pair = pairing(n-2);
        int pairWays = (n-1)* pair;
        int total = pairWays+ single;

        return total;
    }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
}
