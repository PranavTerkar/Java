package Tris;

public class wordBreak {
    static class Node {
        Node children[] = new Node[26]; 
        boolean eow; 

        public Node(){
            for(int i= 0; i<26; i++){
                children[i] = null; 
            }
        }
    }
    public static Node root = new Node(); 
    public static void insert(String word){
        Node curr = root; 
        for(int i= 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a'; 
            if(curr.children[idx] == null){
                curr.children[idx] = new Node(); 
            }

            curr = curr.children[idx]; 
        }

        curr.eow = true; 
        
    }

    public static boolean srarch(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a'; 
            if(curr.children[idx] == null){
                return false; 
            }
            curr = curr.children[idx]; 
        }
        return curr.eow == true; 
    }

    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true; 
        }

        for(int i= 0; i<= key.length(); i++){
            if(srarch(key.substring(0,i)) && wordbreak(key.substring(i))){
                return true; 
            }
        }

        return false; 
    }
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"}; 

        for(int i= 0; i<words.length; i++){
            insert(words[i]);
        }
        String key = "ilikesa"; 
        System.out.println(wordbreak(key));
    }
}
