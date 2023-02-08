package arrayList;

import java.util.*;

public class listCreation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1);// constant time 0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,10);// Liner time 0(n)
        // System.out.println(list);
        // System.out.println(list.get(2));
        // list.remove(2);
        // list.set(2, 10);
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(11));
        // System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
