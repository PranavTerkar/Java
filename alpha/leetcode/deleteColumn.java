package leetcode;

public class deleteColumn {
    public static int delete(String str[]){
        for(int i =0; i<str.length; i++){
            for(int j= 0; j<str[i].length()-1; j++){
                int x = j+1; 
                if(str[i].charAt(j) >= str[i].charAt(x)){
                    return i; 
                }
            }
        }
        return 0; 
    }
    public static void main(String[] args) {
        String str[] ={"cba","daf","ghi"};
        System.out.println(delete(str));
    }
}
