

public class Linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty List");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Empty List");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static int findKey(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int helper(int key, Node head) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(key, head.next);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int recSearch(int key) {
        return helper(key, head);
    }

    public static void reverseList() {
        Node pre = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;

    }

    public static void removeFeomEnd(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            head = head.next;
            return;
        }

        int i = 1;
        int toFind = size - n;
        Node pre = head;

        while (i < toFind) {
            pre = pre.next;
            i++;
        }
        pre.next = pre.next.next;
        return;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = findMid(head);

        Node pre = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        Node right = pre;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            return;
        }
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static Node merge(Node head1, Node head2) {
        Node mergeLl = new Node(-1);
        Node temp = mergeLl;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLl.next;
    }

    private Node getMid(Node head) {
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node meargeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);

        Node righthead = mid.next;
        mid.next = null;

        Node newLeft = meargeSort(head);
        Node newRight = meargeSort(righthead);
       

        return merge(newLeft, newRight);
    }
    public void zigZag(){
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next; 
            curr.next = prev; 
            curr = next;
        }

        Node left = head ;
        Node rignt = prev;
        Node nextl, nextr;

        while (left != null && rignt != null) {
            nextl = left.next;
            left.next = rignt;
            nextr = rignt.next;
            rignt.next = nextl;

            left = nextl;
            rignt = nextr;
        }
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
        Linklist Ll = new Linklist();
        Ll.addFirst(2);
        Ll.addFirst(1);
        Ll.addLast(3);
        Ll.addLast(4);
        Ll.add(2, 9);
        // Ll.head = Ll.meargeSort(Ll.head);
        Ll.zigZag();
        Ll.print();

        // Ll.reverseList();
        // Ll.removeFeomEnd(2);
        // System.out.println(Ll.checkalindrome());
        // System.out.println(Ll.findMid(head));

        // Ll.removeFirst();

        // Ll.print();
        // Ll.removeLast();
        // // Ll.print();
        // System.out.println(Ll.size);
        // System.out.println(Ll.findKey(3));
        // System.out.println(Ll.recSearch(10));

        // head = new Node(2);
        // head.next = new Node(1);

        // Node temp = new Node(2);
        // head.next = temp;

        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
    }
}
