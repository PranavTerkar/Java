package QueueB;

public class usingLinkedlist {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null ;
        }

        static class Queue{
            static Node head;
            static Node tail; 
        
            public static boolean isEmpty(){
                return head == null && tail == null; 
            }
            public static void add(int data) {
                Node newNode = new Node(data); 
            }
        }
        
    }

    public static void main(String[] args) {
        
    }
}
