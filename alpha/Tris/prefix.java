package Tris;

public class prefix {
    static class Node{
        Node children[] = new Node[26]; 
        boolean eow = false; 
        int freq; 
        public Node(){
            for(int i = 0; i<children.length; i++){
                children[i] = null; 
            }
            freq = 1; 
        }
    }

    public static Node root = new Node(); 

    public static void insert(String Word){
        Node curr = root; 
        for(int i = 0; i<Word.length(); i++){
            int idx = Word.charAt(i) - 'a'; 
            if(curr.children[idx] == null){
                curr.children[idx] = new Node(); 
            }else{
                curr.children[idx].freq++; 
            }
            curr = curr.children[idx] ;
        }

        curr.eow = true; 
        
    }
    public static void find(Node root, String ans){
        if(root == null){
            return; 
        }

        if(root.freq == 1){
            System.out.println(ans);
            return; 
        }
        for(int i = 0; i<root.children.length; i++){
            if(root.children[i] != null){
                find(root.children[i], ans+(char)(i + 'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"}; 
        for(int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }

        root.freq = -1;
        find(root, "" );
    }
}
