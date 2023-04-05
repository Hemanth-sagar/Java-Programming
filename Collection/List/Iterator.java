package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Class1 {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
                        List Iterator:
                        next,hasNext,previous,hasPrevious
                        nextIndex,previousIndex,add,set,remove
                 */

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    ListIterator it = list.listIterator();

    while(it.hasNext()){
        System.out.println(it.next());
    }

    //to start with specific index
    ListIterator it2 = list.listIterator(1);

    //to start with end
    ListIterator it3 = list.listIterator(list.size());

    while(it3.hasPrevious()){
        System.out.println(it3.previous());
    }

    //remove all null values
    list.add(null);
    list.add(5);
    list.add(6);
    list.add(null);
    System.out.println(list);
    
    ListIterator it4 = list.listIterator();

    while (it4.hasNext()){
        if(it4.next()==null){
            
//            it4.set(0);
//            it4.add(1);
            it4.remove();
        }
    }
    System.out.println(list);


  }

}
