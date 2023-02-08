package practice.trees.recursion;

public class removeDuplicate {

    public static void dup(String str, int i, StringBuilder strb, boolean map[] ){
        if(i == str.length()){
            System.out.println(strb);
            return; 
        }

        char curr = str.charAt(i); 
        if(map[curr - 'a'] == true){
            dup(str, i+1, strb, map);
        }
        else{
            map[curr - 'a'] = true;
            dup(str, i+1, strb.append(curr), map);
        }

    }
    public static void main(String[] args) {
       String str = "apanacollege";
       dup(str, 0,new StringBuilder (""),new boolean [26]);
    }
}
