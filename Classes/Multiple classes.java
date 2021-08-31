//program to illustrate several classes in java

class First
{
	static void method()
	{
	  System.out.println("Inside Method of First class from main");
	}
}
class Second
{
	void method()
	{
	 System.out.println("Inside Method of Second Class from main");
	}
}
//Can define any no of classes
class MultipleClasses
{
	public static void main(String ar[])
	{
	 System.out.println("Main Begins Inside Main class");
	 First obj1 = new First();
	 obj1.method();
	 System.out.println("Back to main from First class Method ");
	 Second obj2 = new Second();
	 obj2.method();
	 System.out.println("Back to main from Second class Method");
	}
}
