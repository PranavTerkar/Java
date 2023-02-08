package Trees;

public class minDistance {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftFound = lca(root.left, n1, n2);
        Node rightFound = lca(root.right, n1, n2);

        if (leftFound == null) {
            return rightFound;
        }
        if (rightFound == null) {
            return leftFound;
        }

        return root;
    }

    public static int minDistanceInNodes(Node root, int n1, int n2) {
        Node Lca = lca(root, n1, n2);

        return lcaDis(Lca, n2) + lcaDis(Lca, n1);
        
    }

    public static int lcaDis(Node root, int n){
        if(root == null){
            return -1; 
        }
        if(root.data == n){
            return 0; 
        }
        int leftDis = lcaDis(root.left, n);
        int rightDis = lcaDis(root.right, n); 
         
        if(leftDis == -1 && rightDis == -1) {
            return -1;
        }
        else if(leftDis == -1){
            return rightDis +1; 
        }
        else{
            return leftDis +1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);
        System.out.println(minDistanceInNodes(root, 4, 6));
    }
}
