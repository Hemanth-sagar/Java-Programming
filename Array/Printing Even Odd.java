import java.util.*;
class ArrayEvenOdd
{  
  public static void main(String ar[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the no of elements");
	  int n = sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("enter the elements");
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("enter the value");
		  a[i]=sc.nextInt();
	  }
	  int counteven=0,countodd=0;
	  System.out.println("even elements are");
	  for(int i=0;i<n;i++)
	  {
	    if(a[i]%2==0)
	    {
	      counteven++;
	      System.out.print("\t"+a[i]);
	    }
	  }
	  System.out.println("\nodd elements are");
	  for(int i=0;i<n;i++)
	  {
	    if(a[i]%2!=0)
	    {
	      countodd++;
	      System.out.print("\t"+a[i]);
	    }
	  }
	  System.out.println("\n");
	  System.out.println("Total even count is"+counteven);
	  System.out.println("Total odd count is"+countodd);
  }
}
