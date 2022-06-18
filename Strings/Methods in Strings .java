import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        //operation with single string
        String s1 = "Welcome";
        System.out.println(s1.length());
        System.out.println("char at location 3 :" + s1.charAt(2));
        System.out.println("sub string " + s1.substring(3));
        System.out.println("sub string " + s1.substring(0,3));
        System.out.println("Contains k " + s1.contains("k"));

        //operation with two strings
        String s2="ant";
        String s3="Ant";
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.compareTo(s3));

    }
}
