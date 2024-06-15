package Practice.arrayproblems;

import java.util.Scanner;

public class TwoDimentionalArray { 
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[][] =  new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
