package BinarySearchTree;

public class searchInBST {
    static class Node{
        int data; 
        Node left; 
        Node right; 
        Node(int data){
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

    public static boolean search(Node root, int k){
        if(root == null){
            return false; 
        }
        if(root.data == k){
            return true; 
        }
        if(root.data > k){
            return search(root.left, k);
        }
        else{
            return search(root.right, k);
        }

      
    }
    public static void main(String[] args) {
        int values[] = {5, 1,3,4,2,7}; 
        Node root = null; 
        for(int i =0; i< values.length; i++){
            root = insert(root, values[i]);
        }

       System.out.println(search(root, 9));
    }
}
