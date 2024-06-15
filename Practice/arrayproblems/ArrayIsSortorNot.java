package Practice.arrayproblems;

import java.util.Scanner;

public class ArrayIsSortorNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }

        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                flag = false;
            }
        }
        if(!flag){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not Sorted");

        }
    }
}
