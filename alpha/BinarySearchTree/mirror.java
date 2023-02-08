package BinarySearchTree;

public class mirror {
    static class Node {
        int data; 
        Node left; 
        Node right ;

        public Node (int data){
            this.data = data; 
            this.left = null; 
            this.right = null; 
        }
    }
    
    public static Node insert(Node root, int val){
        if(root  == null){
            root = new Node(val); 
            return root ; 
        }

        if(root.data > val ){
            root.left = insert(root.left, val); 
        }else{
            root.right = insert(root.right, val); 
        }

        return root; 
    }
    public static Node mirrorBst(Node root){
        if(root == null){
            return null; 
        }

        Node lst = mirrorBst(root.left); 
        Node rst = mirrorBst(root.right); 

        root.right = lst; 
        root.left = rst; 

        return root; 

    }
    public static void inorder(Node root){
        if(root ==null){
            return ; 
        }

        inorder(root.left);
        System.out.print(root.data +  " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        mirrorBst(root);
        System.out.println();
        inorder(root);
        
    }
}
