package Hashing;
import java.util.*; 
public class iteratorSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); 

        set.add("aurangabad"); 
        set.add("pune"); 
        set.add("mumbai"); 
        set.add("nashik"); 
        Iterator it = set.iterator(); 
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        
        for(String s: set){
            System.out.println(s);
        }
    }
}
