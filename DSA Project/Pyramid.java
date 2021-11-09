/*    *
    * * *
  * * * * *
*/

import java.util.Scanner;
public class MyClass {
    int n;
    Scanner sc;
    public pyramidPattern()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        
        for(int i=0;i<n;i++)
      {
          for(int j=n-i;j>0;)
          for(int j=0;j<=i;j++)
          {
              System.out.print(" *");
          }
          System.out.println("");
      }
    }
    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.pyramidPattern();
    }
}
