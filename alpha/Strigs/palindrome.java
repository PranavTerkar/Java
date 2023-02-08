package Strigs;
import java.util.*;;

public class palindrome {
    public static boolean stringPalindrome(String str) {
        int start = 0; 
        int end = str.length()-1;
        while (start < end) {
            if(str.charAt(end) != str.charAt(start)){
                return false;
            }
            start++;
            end--;
        
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if (stringPalindrome(str)) {
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not");
        }
    //     int start = 0; 
    //     int end = str.length()-1;
    //     while (start < end) {
    //         if(str.charAt(end) == str.charAt(start)){
    //             System.out.println("yes");
    //         }
    //         else{
    //             System.out.println("not");
    //         }
    //         start++;
    //         end--;
        
    //  }
    }
}
