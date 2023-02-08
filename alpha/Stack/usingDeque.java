package Stack;
import java.util.*;

public class usingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public void pop() {
            deque.removeFirst();
        }
        public int peek() {
           return deque.getLast();
        }
    }
    public static void main(String[] args) {
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);

       System.out.println(s.peek());
    }
}
