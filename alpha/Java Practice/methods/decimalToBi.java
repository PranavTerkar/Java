package methods;

public class decimalToBi {

    public static void converter(int n) {
        int total=0 ;
        int x=0;
        while(n>0){
            int reminder = n%2;
            total = total + (int)(reminder*(Math.pow(10, x))) ;
            x++;
            n = n/2;
        }
        System.out.println(total);

        
    }
    public static void main(String[] args) {
        converter(7);
    }
}
