package bitManipulation;

public class getBit {
    public static void getbit(int n, int k) {
        int bitMask =1 << k;
        if((bitMask & n )== 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        int n = 7;
        getbit(n, 1000);

    }
}
