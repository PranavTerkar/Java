package practice.trees;



public class sumTrees {
    static class Node {
        int data; 
        Node left; 
        Node right; 

        public Node (int data){
            this.data = data;
            this.right = null; 
            this.left = null; 
        }
    }

    public static int  sumNode(Node root){
        if(root == null){
            return 0 ;
        }

        int leftData =  sumNode(root.left);
        int rightData = sumNode(root.right);

       int data = root.data; 
       int newLeft = root.left == null ? 0: root.left.data; 
       int newRight = root.right == null ? 0: root.right.data; 
       root.data = leftData + rightData + newRight + newLeft; 

       return data; 
    

    }
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(sumNode(root));
    }
}
