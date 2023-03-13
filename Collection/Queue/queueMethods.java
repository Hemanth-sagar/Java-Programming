import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<String> employees = new LinkedList<>();

        /*

            boolean     offer()
            boolean     add()

            Object      remove()
            Object      poll()

            Object      peek()
            Object      element()

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
