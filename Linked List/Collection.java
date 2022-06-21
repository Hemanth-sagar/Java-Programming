import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");

        for(int i=0;i<list.size();i++){
          System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        list.remove(2);

    }
}
