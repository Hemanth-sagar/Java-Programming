import java.util.*;
class ArraySum
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
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=a[i];
	}
	System.out.println("Total sum is"+sum);
  }
}
