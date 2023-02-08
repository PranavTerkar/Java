
package Trees;

public class level{
    static class Node{
        int data; 
        Node left ; 
        Node right; 

        public Node(int data){
            this.data = data;
            this.left= null;
            this.right =null;
        }
    }
    public static void Klevel(int k, Node root, int level){
        if(root == null){
            return;
        }

        if (level == k) {
            System.out.println(root.data +  " ");
            return; 
        }
        Klevel(k, root.left, level+1);
        Klevel(k, root.right, level+1);
    }
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        Klevel(2, root, 1);
    }
}
