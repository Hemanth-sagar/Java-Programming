/*
Given a number x, determine whether the given number is Armstrong number or not. A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if. 
abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
1. Input : 153
Output : Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153
2.Input : 1253
Output : No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),temp,rem,sum=0;
        int len = String.valueOf(n).length();
      //int len = Integer.toString(n).length();
        temp = n;
        while(n>0){
            rem = n%10;
            sum = sum + (int)Math.pow(rem,len);
            n = n/10;
        }
        if(sum == temp )
        System.out.println("Yes\n"+temp+" is a Armstrong Number");
        else
        System.out.println("No\n"+temp+" is not a Armstrong Number");
    }
}
