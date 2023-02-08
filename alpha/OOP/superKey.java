package OOP;

public class superKey {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.color);
        
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animals constrctor");
    }
}

class Dog extends Animal{
    Dog(){
        super.color = "black";
        System.out.println("Dog constructor");
    }
}
