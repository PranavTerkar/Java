package BinarySearchTree;

public class validateBst {
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

    public static void inrder(Node root){
        if(root ==null){
            return; 
        }
        inrder(root.left);
        System.out.print(root.data  +  " ");
        inrder(root.right);
    }
    public static boolean isValid(Node root, Node min, Node max){
        if(root == null){
            return true; 
        }
        if(  max != null && root.data >= max.data ){
            return false; 
        }if(  min != null && root.data <= min.data){
            return false; 
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max); 

    }
    public static void main(String[] args) {
        int values[] = { 1,1,1 };
        Node root = null; 
        for(int i =0; i<values.length; i++){
            root = insert(root, values[i]); 
        }

        inrder(root);
        if(isValid(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
