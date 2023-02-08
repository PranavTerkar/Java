
public class DoubleLl {
    
    public static  class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        } 

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public  void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head; 
        head.prev = newnode;
        head = newnode;
    }

    public int removeFirst(){
        if (head == null) {
            System.out.println("Empty List");
            size--;
            return Integer.MIN_VALUE;
        }
        if(size == 1 ){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head =head.next;
        head.prev = null;
        size -- ;
        return val;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLl dll = new DoubleLl();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(3);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
    }
   
}
