//Program to display total no of command line arguments/values
//Use of length variable

class CommandLine
{
	public static void main(String arg[])
	{
 	 int x=arg.length;
	 System.out.println("Number of arguments are " + x);
	 System.out.println("first argument is " + arg[0]);
	 System.out.println("second argument is " + arg[1]);
	//Operations on Command line arguments 
	 System.out.println(arg[0]+arg[1]);
	}
}
