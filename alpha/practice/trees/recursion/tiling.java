package practice.trees.recursion;

public class tiling {
    public static int numOfWays(int n ){
        if(n == 1 || n == 0){
            return 1; 
        }
        // return ver + hor; 
        return numOfWays(n-1) + numOfWays(n-2); 
    }
    public static void main(String[] args) {
        System.out.println(numOfWays(3));
    }
}
