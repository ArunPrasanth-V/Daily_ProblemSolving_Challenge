// https://leetcode.com/problems/maximum-subarray/
// 53. Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
       int meh=0;//Maximum Ending Here
        int msf=Integer.MIN_VALUE;//Maximun so for
        for(int i:nums)
        {
            meh+=i;
            if(meh<i)
                meh=i;
            if(meh>msf)
                msf=meh;
        }
        return msf;
    }
}
