// 1748. Sum of Unique Elements
// https://leetcode.com/problems/sum-of-unique-elements/
class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            int c=map.get(i);
            if(c==1)
                sum+=i;
            else if(c==2)
                sum-=i;
        }
        return sum;
    }
}
