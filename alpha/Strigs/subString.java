package alpha.Strigs;

public class subString {
    public static String lavda(int st, int ed, String str) {
        String subString = "";
        for(int i=st; i<ed; i++){
            subString = subString+  str.charAt(i);
        }
        return subString ;
    }
    public static void main(String[] args) {
        String str = "hey This all is just a shit";
        System.out.println(lavda(2, 9, str));
    }
}
 