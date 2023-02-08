package bitManipulation;

public class clearLastIBits {
    public static int clearbits(int n, int k) {
        int bitMask = -1;
        n = n & (bitMask<<k);
        return n;
    }
    public static void main(String[] args) {
        int n= 7;
        System.out.println(clearbits(n, 2));
    }
}
