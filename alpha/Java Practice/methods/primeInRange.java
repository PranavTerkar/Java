package methods;


public class primeInRange {
    public static boolean isPrime(int n) {
        if(n ==2){
            return true;
        }
        for(int i =2; i<=n-1; i++){
            if(n % i==0){
                return false;
            }
        }   
        return true;
    }
    public static void primeInRange(int n ) {
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        primeInRange(20);
    }
}
