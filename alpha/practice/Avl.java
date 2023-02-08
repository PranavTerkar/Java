package practice;

import javax.swing.text.AbstractDocument.LeafElement;

public class Avl {
    static class Node {
        int data, height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static int heights(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return heights(root.left) - heights(root.right);
    }

    public static Node rightRotation(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y; 
        y.left = T2; 

        y.height = max(heights(y.left), heights(y.right)); 
        x.height = max(heights(x.left), heights(x.right)); 

        return x; 

    }

    public static Node leftRotation(Node x) {
       Node y = x.right; 
       Node T2 = y.left; 

       y.left = x; 
       x.right = T2; 

       x.height = max(heights(x.left), heights(x.right)); 
       y.height = max(heights(y.left), heights(y.right)); 

       return y; 
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }
        root.height = 1 + Math.max(heights(root.left), heights(root.right));

        int bf = getBalance(root);

        if (bf > 1 && key < root.left.data) {
            return rightRotation(root);
        }
        if (bf < -1 && key > root.right.data) {
            return leftRotation(root);
        }
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotation(root);
            return leftRotation(root);
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
