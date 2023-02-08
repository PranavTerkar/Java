package bitManipulation;

public class setBit {
    public static void setbit(int n, int k){
        int bitMask = 1 << k;
        n = n| bitMask;
        System.out.println(n);
    }
    public static void main(String[] args) {
        setbit(10, 2);
    }
}
