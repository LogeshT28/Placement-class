package Practice.Leetcode;



import java.util.Arrays;
import java.util.Scanner;

public class LargeCommenPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        // if(n==0){
        //     System.out.println("");
        //     return;
        // }
        int minLen = arr[0].length();
        for (int i = 1; i < n; i++) {
            if (arr[i].length() < minLen) {
                minLen = arr[i].length();
            }
        }

        // int j = 0;
        //         boolean flag = false;
        //         while (j < minLen && !flag) {
        //             char temp = arr[0].charAt(j);
        //             for (int i = 1; i < n; i++) {
        //                 if (arr[i].charAt(j) != temp) {
        //                     flag = true;
        //                     break;
        //                 }
        //             }
        //             if (!flag) {
        //                 j++;
        //             }
        //         }

        //         if(j>1){
        //             System.out.println (arr[0].substring(0,j));
        //         }
        //         else{
        //             System.out.println (new String(""));
        //         }
        //System.out.println(arr[0].substring(0, j));


        StringBuilder str = new StringBuilder();

        Arrays.sort(arr);
        String first = arr[0];
        String last =arr[arr.length-1];
        for(int i=0;i<minLen;i++){
            if(first.charAt(i)!=last.charAt(i)){
                System.out.print("") ;
                break;
            }
            else{
                str.append(first.charAt(i));
            }
        }

        System.out.println(str.toString());



    }
}
