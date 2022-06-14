import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),count=0,arr[]=new int[n],k=-1;
        for(int i=2;i<1000;i++){
            count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1) {
                k++;
                arr[k] = i;
            }
            if(k==n-1) break;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
