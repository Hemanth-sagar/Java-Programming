
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutClass {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,6,7);

        //External for loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //enhanced for loop in previous versions
        for(int i : list){
            System.out.println(i);
        }

        //Internal loops
        //Java 1.8 for each method
        list.forEach(i -> System.out.println(i));//Lambda // Consumer interface


    }
}
