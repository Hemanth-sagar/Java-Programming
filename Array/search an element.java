//search a number in an array
import java.util.*;
class Search
{
 public static void main(String ar[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the no of elements required in array");
   int n = sc.nextInt();
   int a[] = new int[n];
   for(int i=0;i<n;i++)
   {
	System.out.println("enter the a["+i+"] value");
	a[i]=sc.nextInt();
   }
   System.out.println("enter the element to search");
   int search = sc.nextInt();
   for(int i=0;i<n;i++)
   {
	if(a[i] == search)
	{
	 System.out.println("matched");
	}
   }
 }
}
  
