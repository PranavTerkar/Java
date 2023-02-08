import java.util.LinkedList;

public class psudoLinklist {

    public static void main(String[] args) {
        LinkedList<Integer> Ll = new LinkedList<>();

        Ll.addLast(2);
        Ll.addLast(3);
        Ll.addFirst(0);
        Ll.remove();

        System.out.println(Ll);
    }
}
