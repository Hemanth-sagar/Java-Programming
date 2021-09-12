//Display in reverse order
//input using command prompt
class Reverse
{
 public static void main(String ar[])
 {
	int n=ar.length;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	 a[i]=Integer.parseInt(ar[i]);
	}
	System.out.println("values are");
	for(int i=0;i<n;i++)
	{
	 System.out.print("\t"+a[i]);
	}
	System.out.println("\nreversed array is");
	for(int i=n-1;i>=0;i--)
	{
	System.out.print("\t"+a[i]);
	} 
}
}