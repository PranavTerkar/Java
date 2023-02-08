package OOP;


public class abstract_animal {
    public static void main(String[] args) {
        D0g d1 = new D0g();
        // d1.eat();;
        // d1.walks();
    }
}
abstract class Animal{
    String color;
    Animal(){
        //color  = "Black";
        System.out.println("Animal called");
    }
    void eat(){
        System.out.println("eats");
    }

    abstract void walks();
}

class D0g extends Animal{
    D0g(){
        color = "Brown";
        System.out.println(color);
        System.out.println("dog called");
    }
    void walks(){
        System.out.println("Strong walks");
    }
}

class cat extends Animal{

    cat(){
        color = "white";
        System.out.println(color);
    }
    void walks(){
        System.out.println("cute wlalk");
    }
}