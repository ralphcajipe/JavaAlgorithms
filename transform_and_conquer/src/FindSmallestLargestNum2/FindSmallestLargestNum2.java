package FindSmallestLargestNum2;

import java.util.Arrays;

// Look for the smallest and largest number
// Transformed approach
public class FindSmallestLargestNum2 {
    public static void main(String[] args) {
        int[] nums = {6, -1, 7, -2, -3, 0, 1, 2, 3, 4};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        System.out.println("Smallest number is " + nums[0]);
        System.out.println("Largest number is " + nums[nums.length - 1]);
    }
}
