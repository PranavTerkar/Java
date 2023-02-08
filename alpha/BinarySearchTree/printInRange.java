package BinarySearchTree;

public class printInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node create(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data < val) {
            root.right = create(root.right, val);
        }
        if (root.data > val) {
            root.left = create(root.left, val);
        }

        return root;
    }

    public static void isPresent(int i, int j, Node root){
        if(root == null){
            return; 
        }

        if(root.data >= i && root.data<= j){
            System.out.print(root.data +  " ");
        }
        if(root.data > i){
           isPresent(i, j, root.left);
        }
        if(root.data < j){
            isPresent(i, j, root.right);
        }
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = create(root, values[i]);
        }
        isPresent(5, 12, root);
    }
}
