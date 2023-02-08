package twoDArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class choco {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costhor[] = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costhor.length && v < costVer.length) {
            if (costVer[v] <= costhor[h]) {
                cost += (costhor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            v++;
            vp++;
        }
        while (h < costhor.length) {
            cost += costVer[h] * vp;
            h++;
            hp++;
        }
        System.out.println(cost);
    }
}
