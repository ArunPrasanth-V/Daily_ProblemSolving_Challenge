https://leetcode.com/problems/number-of-good-pairs/
1512. Number of Good Pairs
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            int cur=map.getOrDefault(i,0);
            count+=cur;
            map.put(i,cur+1);
        }
        return count;
    }
}
