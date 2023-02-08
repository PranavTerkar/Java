package arrayList;

import java.util.*;
public class water2Pointer {
    public static int storeWater(ArrayList <Integer> hight){
        int maxWater= 0; 
        int s = 0;
        int e = hight.size()-1;
        while(s< e){
            int currHight = Math.min(hight.get(e), hight.get(s));
            int wd = e-s;
            int currWater = currHight* wd;
            maxWater= Math.max(maxWater, currWater);
            if (hight.get(s) < hight.get(e)) {
                s++;
            }
            else{
                e--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(storeWater(list));
    }
}
