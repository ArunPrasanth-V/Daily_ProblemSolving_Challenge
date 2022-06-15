// https://leetcode.com/problems/majority-element/
// 169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
     int mj=0, count=0;
        for(int i:nums){
            if(count==0)
            {
                count++;
                mj=i;
            }
            else if(i==mj)
                count++;
            else
                count--;
        }
        return mj;
    }
}
