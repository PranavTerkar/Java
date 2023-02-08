package QueueB;

public class usingArray {
    static class Queue {

        static int arr[];
        static int Size;
        static int rear;

        Queue(int n) {

            arr = new int[n];
            Size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == Size - 1) {
                System.out.println("Full.........");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }

            return arr[0] ;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); 
        q.add(0);
        q.add(1);
        q.add(2);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove(); 
        }
    }
}
