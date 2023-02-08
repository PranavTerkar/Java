package arrayList;
import java.util.*;
public class swapNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(2);// constant time 0(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int ind1 = list.get(1);
        int ind2 = list.get(3);

        int temp = ind1;
        list.set(1, list.get(3));
        list.set(3, temp);


        System.out.println(list);
    }
}
