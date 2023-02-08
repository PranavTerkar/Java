package methods;

public class binartToDecimal {
    public static void converter(int n) {
        
        // for(int i =0; n>0; i++){
        //     int x = n%10;
        //     total = (x*(2^i))+total;
            
        // }
        // System.out.print(total);
        int x= 0;
        int total = 0;
        while (n>0) {
            int lastDigit = n%10;
            total = total+ (lastDigit * (int)(Math.pow(2, x)));    
            x++;
            n = n/10;
         }
         System.out.println(total);
    }
    public static void main(String[] args) {
        converter(101);
    }
}
