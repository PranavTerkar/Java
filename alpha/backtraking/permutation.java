package backtraking;

public class permutation {
    public static void findpremutation(String str, String ans) {

        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for(int i =0; i< str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            findpremutation(newstr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findpremutation(str, "");
    }
}
