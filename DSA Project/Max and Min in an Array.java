/*
Write a function to return the maximum and minimum element of an array.
1.Input: N = 6
A[] = {8, 458, 456, 87, 56, 167}
Output:
Maximum element is: 458
Minimum element is: 8
2.Input: N = 5
A[] = {2, 58, 45, 56, 167}
Output:
Maximum element is: 167
Minimum element is: 2
*/
import java.util.Scanner;
public class Main {
    static class MinMax{
        int min;
        int max;
    }
    static MinMax findminmax(int a[],int n){
        MinMax minmaxobj = new MinMax();
        if(n==1){
            minmaxobj.min = a[0];
            minmaxobj.max = a[0];
        }
        if(a[0]>a[1]){
            minmaxobj.min = a[1];
            minmaxobj.max = a[0];
        }
        else{
            minmaxobj.min = a[0];
            minmaxobj.max = a[1];
        }
        for(int i=1;i<n;i++){
            if(minmaxobj.min>a[i]){
                minmaxobj.min = a[i];
            }
            else if(minmaxobj.max<a[i]){
                minmaxobj.max = a[i];
            }
        }
        return minmaxobj;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        MinMax obj = findminmax(a,n);
        System.out.println("Maximum element is : " + obj.max +"\nMinimum element is : "+obj.min);
    }
}
