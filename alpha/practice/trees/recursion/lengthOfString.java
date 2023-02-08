package practice.trees.recursion;

public class lengthOfString {
    public static int size(String str){
        if(0 == str.length()){
            return 0; 
        }
        
        
        return size(str.substring(1))  +1 ;
        
    }
    public static void main(String[] args) {
        String str = " hi my name is pranav "; 
        System.out.println(size(str));
        
    }
}
