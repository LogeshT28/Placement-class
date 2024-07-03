
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TripletsEqualToZero {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i >0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right = nums.length-1;
            while(left<right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left]==nums[left+1]){left++;}
                    while (left < right && nums[right]==nums[right-1]){right--;}
                        left++;
                        right--;
                
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create the array and get the elements from the user
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Call the threeSum method
        List<List<Integer>> result = threeSum(nums);
        
        // Print the result
        if (result.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            System.out.println("Triplets that sum to zero:");
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }
        
        scanner.close();
    }
}
