interface I {
    //Public abstract method
    void add(int a,int b);
  
  //static method declaration
    static void show(){
        System.out.println("Default Method Executed");
    }
}
public class OutClass implements I{

  //overriding method
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
    
           OutClass obj = new OutClass();
           obj.add(1,3);

           I.show();

    }
}
