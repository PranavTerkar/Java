package Hashing;
import java.util.*; 
public class basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(); 
        hm.put("India", 150); 
        hm.put("Chaina", 100);
        hm.put("Nepal", 5);

        System.out.println(hm);

        int population = hm.get("India"); 
        System.out.println(population);
        System.out.println(hm.get("Nepal"));
        System.out.println(hm.get("us"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("us"));

        // hm.remove("Chaina"); 
        // System.out.println(hm);

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());
        hm.clear();
       System.out.println(hm.isEmpty());
    }
}
