package Practice.arrayproblems;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int size = s.nextInt();
        int a[]  = new int[size];
        for(int i=0;i<size;i++){
            a[i] = s.nextInt();
        }
        int first =0;
        int second= 0;
        for(int i=0;i<size;i++){
            if(a[i] > first){
                second  = first;
                first = a[i];
            }
            else if(a[i] > second && a[i]!=first){
                    second = a[i];
            }
        }

        System.out.println(second);
        //System.out.println(first);
    }
}
