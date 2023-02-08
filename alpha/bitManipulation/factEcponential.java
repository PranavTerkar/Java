package bitManipulation;

import arrays.reverse;

public class factEcponential {
    public static void name(int n, int k) {
        int ans =1;
        while (n > 0) {
            if ((n & 1) != 0) {
                n = n*ans;
            }
            n = n*n;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        
    }
}
