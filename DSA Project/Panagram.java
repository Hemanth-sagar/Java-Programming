import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]==0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        if(count==0) System.out.println("true");
        else System.out.println("false");
    }
}
