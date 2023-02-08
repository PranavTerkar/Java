package Trees;

public class countOfnodes {
    static class Node{
        int data; 
        Node left, right; 

        public Node(int data){
            this.data = data; 
            this.right = null; 
            this.left = null; 
        }
    }

    public static int noOfNodes(Node root){
        if(root == null){
            return 0; 
        }

        int leftCount = noOfNodes(root.left); 
        int rightCount = noOfNodes(root.right); 

        return (leftCount + rightCount) +1;
    }

    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(noOfNodes(root));
    }
}
