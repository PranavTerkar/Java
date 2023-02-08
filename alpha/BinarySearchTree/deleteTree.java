package BinarySearchTree;


public class deleteTree {
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

    public static Node create(Node root, int val){
        if(root ==null){
            return new Node(val); 
        }
        if(root.data < val){
            root.right = create(root.right, val); 
        }
        if(root.data > val){
            root.left = create(root.left, val); 
        }

        return root; 
    }

    public static Node delete(Node root, int k){
        if(root.data< k){
            root.right = delete(root.right, k);
        }
        else if(root.data> k){
            root.left = delete(root.left, k); 
        }

        else{
            if(root.left == null && root.right == null){
                return null; 
            }
            else if(root.left == null){
                return root.right; 
            }
            else if(root.right == null){
                return root.left; 
            }

            Node IS = InOrederSuccsor(root.right); 
            root.data = IS.data; 
            root.right = delete(root.right, IS.data); 
        }

        return root; 

    }

   
    public static Node InOrederSuccsor(Node root){
        while(root.left != null){
            root = root.left; 
        }

        return root; 
    }

    public static void inorder(Node root){
        if(root == null){
            return ; 
        }

        inorder(root.left);
        System.out.print(root.data +  " ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14}; 
        Node root = null; 
        for(int i =0; i< values.length; i++){
            root = create(root, values[i]);
        }

        inorder(root);
        delete(root, 5); 
        System.out.println();
        inorder(root);
    }
}
