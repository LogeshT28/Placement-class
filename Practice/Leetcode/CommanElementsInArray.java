package Practice.Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommanElementsInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the First Array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.print("Enter the number of elements: ");
        int n2 = s.nextInt();
        System.out.println("Enter the Second Array elements:");

        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }
        System.out.print("Enter the number of elements: ");
        int n3 = s.nextInt();
        System.out.println("Enter the Third Array elements:");

        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) { 
            arr3[i] = s.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        int i=0,j=0,k=0;
        ArrayList<Integer>  list = new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(arr1[i]==arr2[j] && arr2[j]<arr3[k]){
                list.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }
        for(int num:list){
            System.out.print(num+" ");
        }
        
    }
}
