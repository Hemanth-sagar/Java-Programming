//adding two 1D arrays
import java.util.*;
class Add
{
 public static void main(String ar[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("No of elements required");
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	System.out.println("enter the values of first array");
	for(int i=0;i<n;i++)
	{
	 System.out.println("enter the a["+i+"] value");
	 a[i] = sc.nextInt();
	}
	System.out.println("enter the values of second array");
	for(int i=0;i<n;i++)
	{
	 System.out.println("enter the b["+i+"] value");
	 b[i] = sc.nextInt();
	}
	int c[]=new int[n];
	for(int i=0;i<n;i++)
	{
	 c[i]=a[i]+b[i];
	}
	System.out.println("resulted array is");
	for(int i=0;i<n;i++)
	{
	System.out.print("\t"+c[i]);
	} 
}
}
