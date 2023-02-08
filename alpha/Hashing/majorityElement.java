package Hashing;
import java.util.*; 
public class majorityElement {
    public static int elementCount(int arr[],HashMap<Integer, Integer> hm ){
        for(int i = 0; i<arr.length; i++){
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i], hm.get(arr[i]) +1); 
            // }else{
            //     hm.put(arr[i], 1); 
            // }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); 
        }
        for (Integer key : hm.keySet()) {
            if(hm.get(key) >= arr.length/3){
                return key; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        int arr[] = {1,2,2,2,3,4,1,5,5}; 
        System.out.println(elementCount(arr, hm));
    }
}
