package OOP; 

public class firstOop{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.setColor("Yellow");
        p1.color = "yellow";
        p1.setTio(10);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor( String newColor){
        color  = newColor;
    }

    void setTio (int newtip){
        tip = newtip; 
    }
}