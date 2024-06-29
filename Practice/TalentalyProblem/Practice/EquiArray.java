package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EquiArray {
    public static boolean Compare(int a,int b){
        char a1[] = Integer.toString(a).toCharArray();
        char b1[] = Integer.toString(b).toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1,b1);
    }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the First Array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the Second Array elements:");

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }

        List<String> pair = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<n;j++){
                if(Compare(arr1[i],arr2[j])){
                    pair.add(i+","+j);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No Pairs Found");
                return;
            }
        }

        for(String i:pair){
            System.out.print(i+" ");
        }
    }
}
