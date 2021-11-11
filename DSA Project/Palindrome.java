/*
A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.
Examples : 
1.Input :  12344321
Output :  12344321 is a palindrome
2.Input : 1231
Output : 1231 is not a palindrome
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),rem,rev=0,temp;
        temp = n;
        while(n!=0){
            rem = n%10;
            rev = rev*10+rem;
              n = n/10;
        }
        if(temp==rev)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" is not a palindrome");
    }
}
