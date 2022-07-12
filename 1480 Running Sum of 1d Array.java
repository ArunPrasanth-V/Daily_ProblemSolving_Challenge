// https://leetcode.com/problems/running-sum-of-1d-array/
// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
      int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; 
            nums[i]=sum; 
        } 
        return nums;
    }
}
