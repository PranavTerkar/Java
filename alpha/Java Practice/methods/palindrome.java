package methods;

public class palindrome {
    public static int reverseNum(int n) {
        int x=0;
        int reverse=0;
        while (n!=0) {
            x = n%10;
            reverse = reverse*10+ x;
            n = n/10;
        }
        return reverse;
    }

    public static void palindrome(int x ) {
        if (reverseNum(x) == x) {
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("Not Plaindrome");
        }
        
    }
    public static void main(String[] args) {
        palindrome(123);
    }
}
