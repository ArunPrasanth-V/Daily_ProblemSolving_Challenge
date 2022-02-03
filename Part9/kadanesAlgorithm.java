// work both positive and negative integer.
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int meh=0;
        int msf=Integer.MIN_VALUE;
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
