//Program to illustrate nested methods using This keyword

class SampleSix
{
	int a;
	void method1()
	{
	  System.out.println("inside method1 from main");
	  System.out.println("a in method is"+a);
    //objects can be created anywhere as required
	  SampleSix s2=new SampleSix();
	  System.out.println("a is "+s2.a);
	  s2.method2();
	  System.out.println("inside method1 from method2");
    //'This' refers to the object which has called the method
	  this.method2();
	  System.out.println("inside method1 from method2");
	  method2(); //equals to s1.method2
	  System.out.println("inside method1 from method2");
	}
  
	void method2()
	{
	  System.out.println("inside method2 from method1");
	}

	public static void main(String arg[])
	{
	  SampleSix s1=new SampleSix();
	  System.out.println("inside main");
	  System.out.println("a is "+s1.a);
	  s1.method1();
	  System.out.println("back to main from method1");
	}
}
