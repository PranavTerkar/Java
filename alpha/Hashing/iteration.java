package Hashing;
import java.util.*; 
public class iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(); 
        hm.put("India", 100); 
        hm.put("Chaina", 150);
        hm.put("Nepal", 5); 
        hm.put("US", 50); 

        Set<String> Keys = hm.keySet(); 

        for (String k : Keys) {
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
    }
}
