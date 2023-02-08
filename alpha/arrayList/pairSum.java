package arrayList;

import java.util.*;
public class pairSum {
    public static boolean pairsum1(ArrayList<Integer> list, int tar){
        for(int i = 0; i< list.size(); i++){
            for(int j = i+1; j< list.size(); j++){
                if(list.get(i) + list.get(j) == tar){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairsum1(list, 5));
    }
}
