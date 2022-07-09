// 167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int num=target-numbers[i];
            int n=map.getOrDefault(num,-1);
            if(n!=-1){
                return new int[]{n,i+1};
            }
            map.put(numbers[i],i+1);
        }
        return new int[]{-1,-1};
    }
}
