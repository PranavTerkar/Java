package patterns;

public class inHalfNum {

    public static void inHalfNumber(int n ) {
        int x =1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i+1); j++){
                System.out.print(j+ " ");
           
            }
     
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inHalfNumber(6);
    }
}
