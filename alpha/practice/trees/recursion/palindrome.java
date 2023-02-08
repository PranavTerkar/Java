package practice.trees.recursion;

public class palindrome {
    public static boolean isPalindrome(String str, int s, int e){
        if(s == e){
            return false; 
        }

        if(str.charAt(s) != str.charAt(e)){
            return false; 
        }

        isPalindrome(str, s+1, e-1); 
        return true; 
    }
    public static void main(String[] args) {
        String str = "lol"; 
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
