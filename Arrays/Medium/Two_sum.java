
package Arrays.FAQs_Medium;

import java.util.Arrays;
import java.util.HashMap;

// Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
// Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.
// Examples:
// Input: nums = [1, 6, 2, 10, 3], target = 7
// Output: [0, 1]
// Explanation:
// nums[0] + nums[1] = 1 + 6 = 7


public class Two_sum {

    public static int[] two_sum_bruteForce(int[] arr, int target){

        int[] output = {0,0};
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    output[0] = i;
                    output[1] = j;
                } 
            }
        }
        
        return output;
    }


    public static int[] two_sum_optimized(int[] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            
        }
        return arr;
    }



    public static void main(String[] args) {

        // int[] arr = {1,6,2,10,3};
        int[] arr = {1, 3, 5, -7, 6, -3};
        int target = 0;

        System.out.println(Arrays.toString(two_sum(arr, target)));
        
    }
    
}
