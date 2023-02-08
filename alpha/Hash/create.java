package Hash;
import java.util.*; 

public class create {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 

        pq.add(1); 
        pq.add(2); 
        pq.add(3); 
        pq.add(4); 

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove(); 
        }
    }
}
