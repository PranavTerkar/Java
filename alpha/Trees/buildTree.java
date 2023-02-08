package Trees;
import java.util.*; 

public class buildTree {
    static class Node{
        int data; 
        Node left; 
        Node right; 

        Node(int data){
            this.data = data; 
            Node right = null;
            Node left = null;
        }
    }
    static class BinaryTreea{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null; 
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode; 
        }

        public static void preorder(Node root){
            if(root == null){
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                
                return;
            }
            inorder(root.left);
            System.out.print(root.data +  " ");
            inorder(root.right);

        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +  " ");
        }

        public static void level(Node root){
            Queue <Node> q = new LinkedList<>(); 
            q.add(root); 
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove(); 
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break; 
                    }else{
                        q.add(null); 
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreea tree = new BinaryTreea(); 
        Node root = tree.buildtree(node);
        // System.out.println(root.data);

        // tree.preorder(root);
        // System.out.println();

        // tree.inorder(root);
        // System.out.println();

        // tree.postOrder(root);

        tree.level(root);


    }
}
