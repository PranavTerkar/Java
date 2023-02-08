package Tris;

public class longestWordprefix {
    static class Node{
        Node children[] = new Node[26]; 
        boolean eow = false; 
      
        public Node(){
            for(int i = 0; i<children.length; i++){
                children[i] = null; 
            } 
        }
    }
    public static Node root = new Node(); 
    public static void insert(String word){
        Node curr = root; 
        for(int i = 0 ;i<word.length(); i++){
            int idx = word.charAt(i) - 'a'; 
            if(curr.children[idx] == null){
                curr.children[idx] = new Node(); 
            }
            
            curr = curr.children[idx]; 
        }
        curr.eow = true; 
    }
    public static String ans =""; 

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return; 
        }

        for(int i = 0; i<26; i++ ){
            char ch = (char)(i + 'a'); 
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append(ch); 
                if(temp.length() > ans.length()){
                    ans = temp.toString(); 
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()- 1); 
            }
        }
    }
    
    public static void main(String[] args) {
        String words[] = {"a", "banana", "ap", "app", "appl","apply" };
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
