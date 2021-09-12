//no of prime numbers in it
import java.util.*;
class PrimeNums
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
		System.out.println("enter the value"+(i+1));
		a[i]=sc.nextInt();
	}
	int countprime=0;
	for(int i=0;i<n;i++)
	{
	 int count=0;
	 for(int j=2;j<a[i];j++)
	 {
	   if(a[i]%j==0)
	   {
	    count++;
	    break;
	   }
	 }
	 if(count==0)
	 {
	 countprime++;
	 System.out.print("\t"+a[i]);
	 }
	}
	System.out.println("\nTotal prime count is "+countprime);
  }
}
	    
