package BinarySearchTree;
import java.util.*; 

public class rootToPath {
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
    public static void printPath(ArrayList<Integer> list){
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i) +  " --> ");
        }
        System.out.println("Null");
    }

    public static void allPath(Node root, ArrayList<Integer> list){
        if(root == null){
            return; 
        }
        list.add(root.data);
        if(root.left == null && root.right == null){
            printPath(list); 
        }
       
        allPath(root.left, list);
        allPath(root.right, list);
        list.remove(list.size()-1); 


    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = create(root, values[i]);
        }
         
        allPath(root,  new ArrayList<>());
    }
}
