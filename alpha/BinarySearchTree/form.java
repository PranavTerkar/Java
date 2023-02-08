package BinarySearchTree;

public class form {

    static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void inorder( Node root){
        if(root == null){
            return; 
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node create(int arr[] ,int e, int s) {
        if(s > e){
            return null ;
        }
        int mid = (s+e)/2; 
        Node root = new Node(arr[mid]); 
        root.left = create(arr, mid-1, s);
        root.right = create(arr, e, mid+1); 

        return root; 
        
    }
    public static void preorder( Node root){
        if(root == null){
            return; 
        }
        System.out.print(root.data + " ");
        inorder(root.left);
        
        inorder(root.right);
    }
    

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12}; 

        Node root = create(arr, arr.length-1, 0); 
        inorder(root);
        System.out.println();
        preorder(root);
        
    }

}
