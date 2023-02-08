package Recursions;

public class stringDup {
    public static void removr(String str, int i, StringBuilder newStr, boolean map[]){
        if(i == str.length()){
            System.out.println(newStr);
            return; 
        }

        char currchar = str.charAt(i); 
        if(map[currchar - 'a'] == true){
            removr(str, i+1, newStr, map);
        }else{
            map[currchar - 'a'] = true; 
            removr(str, i+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apanacollege"; 
        removr(str, 0, new StringBuilder("") , new boolean[26]);
    }
}
