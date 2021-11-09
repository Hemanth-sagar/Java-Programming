Right Triangle Star Pattern
/*
  *
  * *
  * * *
*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of lines required");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<=i;j++)
          {
              System.out.print(" * ");
          }
          System.out.println("");
      } 
    }
}
