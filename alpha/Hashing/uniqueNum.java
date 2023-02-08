package Hashing;
import java.util.*; 

public class uniqueNum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,4,2,5,6,8,2,1}; 
        HashSet<Integer> set  = new HashSet<>(); 

        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]); 
        }

        System.out.println(set.size());
    }
}
