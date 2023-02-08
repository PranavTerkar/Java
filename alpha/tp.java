public class tp {
    public static void main(String[] args) {
        int a = 4; 
        int b = 6; 
        System.out.println(a + " "+ b);
        int sim = a+b;  
        b = sim - b; //now b is a
        a = sim - b; // remove a from sum and get b
        System.out.println(a + " " + b);
    }
}
