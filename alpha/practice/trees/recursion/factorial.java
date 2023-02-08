package practice.trees.recursion;

public class factorial {
    public static int findfac(int n){
        if(n <= 0){
            return 1;  
        }

        
        // return n*findfac(n-1);
        return n+ findfac(n-1); 

    }
    public static void main(String[] args) {
        System.out.println(findfac(5));
    }
}
