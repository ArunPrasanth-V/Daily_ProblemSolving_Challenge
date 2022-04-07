// https://leetcode.com/problems/kth-largest-element-in-an-array/
// 215. Kth Largest Element in an Array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        
        return nums[nums.length-k];
    }
}
