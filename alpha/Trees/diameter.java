package Trees;


public class diameter {
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

    public static int height(Node root){
        if(root == null){
            return 0 ;
        }

        int lh = height(root.left);
        int hr = height(root.right);
        return Math.max(lh , hr) +1; 
    }
    // public static int diameter2(Node root){
    //     if(root == null){
    //         return 0; 
    //     }

    //     int lehe = height(root.left);
    //     int rehe = height(root.right); 
    //     int ledi = diameter(root.left); 
    //     int redi = diameter(root.right); 

    //     int selfDi = lehe+rehe+1;

    //     return Math.max(selfDi, Math.max(ledi, redi)); 

    // }

    static class Info{
        int dia; 
        int ht; 

        public Info(int dia, int ht){
            this.dia = dia; 
            this.ht = ht; 
        }
    }

   

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0); 
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia,rightInfo.dia), leftInfo.ht+rightInfo.ht+1  );
        int ht  = Math.max(leftInfo.ht, rightInfo.ht) +1 ;

        return new Info(dia, ht); 
    }
        
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(diameter(root).dia);
    }

}
