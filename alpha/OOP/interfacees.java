package OOP;

public class interfacees {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen{
    public void moves(){
        System.out.println("All directions");
    }
}

class King{
    public void moves(){
        System.out.println("All directions(only by one stape");
    }
}