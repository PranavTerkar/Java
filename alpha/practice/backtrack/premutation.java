package practice.backtrack;


public class premutation {
    public static void findPermutations(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for(int i =0; i<str.length(); i++){
            char cuurr = str.charAt(i); 
            String newstr = str.substring(0, i) + str.substring(i+1); 
            findPermutations(newstr, ans+cuurr);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, new String(""));
    }
}
