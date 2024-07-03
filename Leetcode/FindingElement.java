

import java.util.Scanner;

public class FindingElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  a[] = new  int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int missing = n*(n+1)/2;
        int sum=0;
        for(int num:a){
            sum+=num;
        }

        System.out.println(Math.abs(sum-missing));
        }
}
