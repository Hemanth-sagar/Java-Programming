import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        //1:using string literal
         String s1 ="java";
         System.out.println("s1 = " + s1);
      
         //2:using new keyword
        String s2 = new String("is object oriented");
        System.out.println("s2 = " + s2);
      
        //3:converting char to string
        char arr[] = {'a','e','i','o','u'};
        String str = new String(arr);
        System.out.println("s3 = " + str);
      
        //concatenating strings
        System.out.println(s1 + s2 + str);
    }
}
