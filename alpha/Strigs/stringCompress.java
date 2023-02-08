package Strigs;


public class stringCompress {

    public static StringBuilder compress(String str) {
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr.append(i);
            if (count > 1) {
                count.toString();
                newStr.append(count);
               // newStr += count.toString();
            }
        }
        newStr.toString();
        return newStr;
    }
    public static void main(String[] args) {
        String str = "qqqvvbbddcg";
        System.out.println( compress(str));;
    }
}
