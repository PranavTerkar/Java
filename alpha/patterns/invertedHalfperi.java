package patterns;

public class invertedHalfperi {
    public static void printer(int n ) {
        for(int i= 0; i<=n;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        printer(5);
    }
}
