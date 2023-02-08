package backtraking;

public class subSets {

    public static void printSubset(String str, int i, String ans) {
        if (i == str.length()){
            System.out.print(ans + " ");
            return;
        }
            
        printSubset(str, i+1, ans+str.charAt(i));
        printSubset(str, i+1, ans);
        
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubset(str, 0, " ");
    }
}
