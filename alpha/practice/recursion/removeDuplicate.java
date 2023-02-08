package practice.recursion;

public class removeDuplicate {
    public static void reDup(String s, int n, StringBuilder sb, boolean map[] ){
        if(n == s.length()){
            System.out.println(sb);
            return ; 
        }
        char currChar =  s.charAt(n); 
        if(map[currChar- 'a'] == true ){
            reDup(s, n+1, sb, map);
        }else{
            map[currChar - 'a'] = true; 
            sb.append(s.charAt(n)); 
            reDup(s, n+1, sb, map);
        }

    }
    public static void main(String[] args) {
        String s = "apnacollege"; 
        reDup(s, 0, new StringBuilder(""), new boolean[26]);
    }
}
