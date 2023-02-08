package Hashing;
import java.util.*; 

public class unionAndIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); 
        ArrayList<Integer> arr = new ArrayList<>(); 
        int arr1[] = {7,3,9}; 
        int arr2[] = {6,3,9,2,9,4}; 

        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]); 
        }
        int count = 0; 
        for(int i =0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++; 
                arr.add(arr2[i]);
                set.remove(arr2[i]);
                
            }
        }

        System.out.println(count);
        System.out.println(arr);
        
    }
}
