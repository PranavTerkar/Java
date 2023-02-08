package bitManipulation;

public class clearBit {
    public static int clearbit(int n,int k ){
        int bitMask = ~(1<< k);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearbit(10, 1));
    }
}
