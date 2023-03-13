import java.util.*;

class Main {
    public static void main(String[] args) {
    
      Stack<String> employees = new Stack<>();

        /*

            int         peek()
            int         push() - set element at index and return previous ele

            Object      Pop(Object o)
            int         Search(Object o) - returns 1 based index starting from top
            boolean     empty() - tests if this stack is empty.
                        Returns:
                        true if and only if this stack contains no items; false otherwise.

         */


        employees.push("Sankar");
        employees.push("Sagar");
        employees.push("Shiva");

        System.out.println(employees);

        System.out.println(employees.pop());
        System.out.println(employees.peek());

        System.out.println(employees);  //[Sankar, Sagar]
        System.out.println(employees.search("Sankar")); //2

        System.out.println(employees.empty()); //false

      
    }
}
