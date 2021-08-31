//count no of command line arguments 
//display all values

class CommandLine2
{
	public static void main(String arg[])
	{
	 int x=arg.length;
	 int i;
	 System.out.println("No of command line arguments" + x);
	 for(i=0;i<x;i++)
	 {
	 System.out.println( i+1 +" Argument " + arg[i]) ;
	 }
	}
}
