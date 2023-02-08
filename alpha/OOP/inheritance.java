package OOP;

public class inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.breathe();
        f1.color = "black";
        System.out.println(f1.color); }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}