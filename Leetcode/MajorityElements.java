// package Leetcode;
import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int majorityElement(int[] nums) {
    //     int max = Integer.MIN_VALUE;
    //     int count=0;
    //     if(nums.length==1){
    //         return nums[0];
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             count++;
    //         }
    //         if(count>max){
    //             max= nums[i];
    //         }
    // }
    // }
    // return max;
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    int n = nums.length;
    return nums[n/2];
}
}
public class MajorityElements {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=  s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Solution o = new Solution();
        System.out.println(o.majorityElement(arr));
    }
}
