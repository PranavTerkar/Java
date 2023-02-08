
package BinarySearchTree;

import java.util.*;

public class mergeBST {
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

    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static Node createBST(ArrayList<Integer> list, int s, int e){
       if(s> e){
            return null; 
       }
       int mid = (s+e)/2; 
       Node root = new Node(list.get(mid)); 

       root.left = createBST(list, s, mid-1); 
       root.right = createBST(list, mid+1, e); 

       return root; 
    }
    public static Node mergeBSTs(Node root1, Node root2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        inorder(root1, list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root2, list2);

        ArrayList<Integer> finalList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                finalList.add(list1.get(i));
                i++;
            } else {
                finalList.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            finalList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }

        return createBST(finalList, 0, finalList.size()-1); 
    }

    public static void preorder(Node root){
        if(root == null){
            return ; 
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

       Node root = mergeBSTs(root1, root2);
       preorder(root);
    }
}
