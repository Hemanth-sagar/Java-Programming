class Constructors {
    String name;
    int age;
    void getInfo(){
        System.out.println("Name is " + name + " and his/her age is " + age);
    }
    //Default constructor
    One(){}
    //Parameterized constructor
    One(String name,int age){
        this.name=name;
        this.age=age;
        this.getInfo();
    }
    //Copy constructor *Note : user defined whereas c++ inbuilt copy constructor has
    One(One obj){
        this.name=obj.name;
        this.age=obj.age;
    }
}
public class Main {
    public static void main(String[] args) {
        One obj = new One();
        obj.name="Hemanth";
        obj.age=20;

        One obj2 = new One(obj);
        obj2.getInfo();

    }
}
