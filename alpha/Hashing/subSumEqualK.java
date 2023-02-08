package Hashing;
import java.util.*; 
public class subSumEqualK {
    public static int sum(int k, int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int sum = 0;
        int ans = 0;  
        map.put(0,1); 
        for(int i =0; i<arr.length; i++){
            sum += arr[i]; 
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k); 
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); 
        }
        return ans; 
    }
    public static void main(String[] args) {
       int arr[] = {10,2,-2,-20,10}; 
       System.out.println(sum(-10, arr));
    //    HashMap<Integer, Integer> map = new HashMap<>(); 
    //    int k =-10; 
    //    map.put(0,1); 
    //    int ans = 0; 
    //    int sum = 0; 

    //    for(int i = 0; i<arr.length; i++){
    //         sum += arr[i]; 
    //         if(map.containsKey(sum-k)){
    //             ans += map.get(sum-k); 
    //         }
    //         map.put(sum, map.getOrDefault(sum, 0) + 1); 
    //    }

    //    System.out.println(ans);
    }
}
