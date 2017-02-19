/*
Given an array of integers, find the subarray with smallest sum.

Return the sum of the subarray.

 Notice

The subarray should contain one integer at least.

Example
For [1, -1, -2, 1], return -3.
/*

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() == 0){
            return 0;
        }
        
        int[] dp = new int[nums.size() + 1];
        dp[0] = nums.get(0);
        int min = dp[0];
        
        for(int i = 1; i < nums.size(); i++){
            dp[i] = nums.get(i) + (dp[i - 1] > 0 ? 0 : dp[i-1]);
            min = Math.min(min, dp[i]);
        }
        
        return min;
    }
}
