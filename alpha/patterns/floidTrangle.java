package patterns;

public class floidTrangle {
    public static void printer(int n) {
        int x=1;
        for(int i = 0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+ " ");
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printer(5);
    }
}
