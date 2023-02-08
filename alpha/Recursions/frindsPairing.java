package Recursions;

public class frindsPairing {
    public static int pair(int n){
        if(n == 2 || n == 1){
            return n; 
        }
        int single = pair(n-1); 
        int pair = (n-1)* pair(n-2); 

        return pair +single; 

    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
