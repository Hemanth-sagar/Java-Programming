import java.util.*;
class Main {
    public static void main(String[] args) {
        /*
            Imp: Union and Intersection
                 convert set to list
         */
        Set<Integer> hs1=new HashSet<>();
        hs1.add(10);
        hs1.add(40);
        hs1.add(23);
        hs1.add(26);

        System.out.println(hs1);

        Set<Integer> hs2=new HashSet<>();
        hs2.add(10);
        hs2.add(40);
        hs2.add(500);
        hs2.add(300);

        System.out.println(hs2);

//        hs1.addAll(hs2);
        System.out.println(hs1);

//        Intersetion
//        hs1.retainAll(hs2);
        System.out.println(hs1);

        List<Integer> list=new ArrayList<>();
        list.addAll(hs1);

        System.out.println(list);
      
      
    }
}
      
      
      
      
      
