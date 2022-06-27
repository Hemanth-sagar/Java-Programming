import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        
        //operation with single string
        String s1 = "Welcome";
        System.out.println(s1.length());
        
        for(int i=0;i<s1.length();i++){
            System.out.println("char at location 3 :" + s1.charAt(i));
        }
        
        //s2 > s3 = +ve
        //s2 == s3 = 0
        //s2 < s3 = -ve
        System.out.println(s2.compareTo(s3));

        //== operator with string
        String s2="ant";
        String s3="ant";
        System.out.println(s2==s3);//True
        if(new String("ant") == new String("ant")){ } // Return false
        
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        
        String s1 = "Ant is an insect";
        //Sub Strings
        //till end 
        //start index parameter
        System.out.println("sub string " + s1.substring(4));//is an insect
        //index 3 not include till 0 -- 2
        System.out.println("sub string " + s1.substring(0,3));//Ant 
        
        System.out.println("Contains k " + s1.contains("k"));

    }
}
