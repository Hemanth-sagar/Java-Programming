import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<String> employees = new LinkedList<>();

        /*

            boolean     add() - Throw exception if not possible to add
            boolean     offer() - Capacity restricted queue prefer this

            Object      remove() - Throw exception if empty
            Object      poll() - return null if empty

            Object      peek() - Throw exception if empty
            Object      element() - return null if empty

         */


        employees.offer("Sankar");
        employees.offer("Sagar");
        employees.add("Shiva");

        System.out.println(employees); //[Sankar, Sagar, Shiva]

        System.out.println(employees.peek()); //Sankar
        System.out.println(employees.element()); //Sankar

        System.out.println(employees.remove()); //Sankar
        System.out.println(employees.poll()); //Sagar

        System.out.println(employees);  //[Shiva]
      
      
      
    }
}
