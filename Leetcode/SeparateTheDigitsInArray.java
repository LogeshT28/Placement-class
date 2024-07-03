

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    
public class SeparateTheDigitsInArray {
    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String str = String.valueOf(nums[i]);
            for(char c :str.toCharArray()){
                list.add(Character.getNumericValue(c));
            }

        }
        int[] res  = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

       // Solution o = new Solution();
        int[] result = separateDigits(arr);

       // Printing the resulting array
        System.out.println("The separated digits are:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
