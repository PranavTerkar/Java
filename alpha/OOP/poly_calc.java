package OOP;

public class poly_calc {

    public static void main(String[] args) {
        Calculator c1  =new Calculator();
        c1.sum(10,10);
        c1.sum((float)2.4, (float)2.4);
        c1.sum(2, 2, 2);
    }
}

class Calculator{
    void sum(int a , int b){
        System.out.println(a+b);
    }

    void sum(float a, float b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
