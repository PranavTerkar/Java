package bitManipulation;

public class oddOrEven {

    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        int n =9;
        oddEven(n);
    }
}
