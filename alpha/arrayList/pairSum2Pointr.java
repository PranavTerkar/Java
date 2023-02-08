package arrayList;

import java.util.*;
public class pairSum2Pointr {
    public static boolean pairsum1(ArrayList<Integer> list, int tar){
        int s = 0;
        int e = list.size()-1;
        while(s < e){
            if(list.get(e) + list.get(s) == tar){
                return true;
            }
            if(list.get(e) + list.get(s) < tar){
                s++;
            }
            else{
                e--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1);// constant time 0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairsum1(list, 10));
    }
}
