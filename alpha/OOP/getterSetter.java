package OOP;


public class getterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        // System.out.println(p1.color);
    }
}

class Pen{
    String color;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}
