import java.util.*;

class Main {
    public static void main(String[] args) {
      
      //Object refer to all types 
      //here heterogenous
      List<Object> employees = new ArrayList<>();
      
      employees.add(12);
      employees.add(3.0);
      employees.add("hemanth");
      
      System.out.println(employees);
      //[12, 3.0, hemanth]
      
      /*
        Instance of Operator
        syntax:
          Object instanceof Integer
        
        returns boolean
      */
      
      System.out.println(employees.get(0) instanceof Integer);
      System.out.println(employees.get(1) instanceof Double);
      System.out.println(employees.get(2) instanceof String);
      //Above three statements return true 
      
      //for false case
      System.out.println(employees.get(0) instanceof String);

    }
}
