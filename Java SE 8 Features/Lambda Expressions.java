
//Lambda expressions
interface I{
    void show(int i);
}

public class OutClass {

    public static void main(String[] args) {

        //Anonymous inner class
        //it creates .class file
        I obj ;
        obj = new I() {
            public void show(int i) {
                System.out.println("hello"+i);
            }
        };

        //java 8 features
        obj = (int i) ->{
            System.out.println("Hello"+i);
        };
        //or
        obj = (int i) -> System.out.println("Hello"+i);
        //or
        obj = (i) -> System.out.println("Hello"+i);
        obj = i -> System.out.println("Hello"+i);


    }
}
