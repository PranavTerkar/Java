package backtraking;

public class gridWays {

    public static int ways(int n, int m, int i, int j) {
        if (i == n-1 && j == m-1) {
            return 1;
        }
        else if(i == n || j == m ){
            return 0;
        }

        int w1 = ways(n, m, i +1, j);
        int w2 = ways(n, m, i, j+1);

        return w1 + w2;
    }
    public static void main(String[] args) {
        System.out.println(ways(2, 2, 0, 0));
    }
}
