package GreedyALgo;
import java.util.*;

public class activitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        LinkedList<Integer> ans = new LinkedList<>();
        int maxAct = 0;

        // activity 1

        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i= 1; i <= start.length-1; i++){
            if(start[i] >= lastEnd){
                maxAct++; 
                ans.add(i);
                lastEnd = end[i];

            }
        }
        System.out.println(maxAct);

        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}
