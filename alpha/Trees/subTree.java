package Trees;


public class subTree {
    
    static class Node{
        int data; 
        Node left; 
        Node right; 

        public Node(int data){
            this.data = data; 
            Node left = null; 
            Node right = null; 
        }
    }

    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true; 
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false; 
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false; 
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false; 
        }

        return true; 
    }

    public static boolean isSubtree(Node root, Node subTree){
        if(root == null){
            return false; 
        }
        if(root.data == subTree.data){
            if(isIdentical(root,subTree)){
                return true; 
            }
        }

        return isSubtree(root.left, subTree) || isSubtree(root.right, subTree); 
    }


    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        Node subRoot  = new Node(2);
        subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        System.out.println(isSubtree(root, subRoot));
    }
}
