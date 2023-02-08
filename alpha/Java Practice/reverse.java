public class reverse {
    public static void main(String[] args) {
        int x = 12345;
        int count;
        for(int i =0; x!=0; i++){
            count = x%10;
            x = x/10;
            System.out.print(count);
        }
    }
}
