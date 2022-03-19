// https://leetcode.com/problems/build-array-from-permutation/
// 1920. Build Array from Permutation

class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                arr[i]=nums[nums[i]];
            }
        return arr;
    }
}
