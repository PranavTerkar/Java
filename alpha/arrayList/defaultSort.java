package arrayList;

import java.util.*;
public class defaultSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(2);// constant time 0(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
