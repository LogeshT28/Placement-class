
import java.util.Scanner;

public class TwoSumWithSortedArray{
    public static int[] twoSum(int[] numbers, int target) {
        int sum=0;
        for(int i=0;i<=numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                sum=numbers[i]+numbers[j];
                    if(sum==target){
                        return new int[]{i+1,j+1};
                    }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create the array and get the elements from the user
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Get the target value from the user
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        // Call the twoSum method
        int[] result = twoSum(numbers, target);
        
        // Print the result
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
        }
        
        scanner.close();
    }
}
