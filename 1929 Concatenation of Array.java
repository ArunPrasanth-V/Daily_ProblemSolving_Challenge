1929. Concatenation of Array
https://leetcode.com/problems/concatenation-of-array/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return  arr;
    }
}
