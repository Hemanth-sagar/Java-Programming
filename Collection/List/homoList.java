import java.util.*;

class Main {
    public static void main(String[] args) {
      
        List<String> employees = new ArrayList<>();

        /*

            int         get(index) - returns the element at index
            int         set() - set element at index and return previous ele

            int         indexOf(Object o)
                        lastIndexOf(Object o)

         */

        employees.add("Sankar");
        employees.add("Sagar");

        System.out.println(employees.set(0,"hi"));
        System.out.println(employees.get(0));

        System.out.println(employees.indexOf("hi"));
        System.out.println(employees.lastIndexOf("hi"));
   
    }
}
