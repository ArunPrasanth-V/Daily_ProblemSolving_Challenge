// work both positive and negative integer.
class Solution {
    public int maxSubArray(int[] nums) {
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
