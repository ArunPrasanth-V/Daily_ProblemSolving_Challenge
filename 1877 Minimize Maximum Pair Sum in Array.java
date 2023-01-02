//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/
//1877. Minimize Maximum Pair Sum in Array
class Solution {
    public int minPairSum(int[] nums) 
    {
        //Soultion 1
    //    Arrays.sort(nums);
    //    int max=0,b=nums.length-1;
    //    for(int a=0;a<nums.length/2;a++)
    //    {
    //        max=Math.max((nums[a]+nums[b]),max);
    //        b--;
    //    }
    
    //soltion 2
    int max=0;
    int min=0;
    int arr[]=new int[100001];
    for(int i:nums)
    {
        arr[i]++;
        min=Math.min(min,i);
        max=Math.max(max,i);
    }
    int start=min;
    int end=max;
    max=0;
    while(start<=end)
    {
        if(arr[start]<=0)start++;
        else if(arr[end]<=0)end--;
        else
        {
            System.out.println(start+" "+end);
             max=Math.max(max,start+end);
             int reduce=Math.min(arr[start],arr[end]);
             arr[start]-=reduce;
             arr[end]-=reduce;
        }
    }
        return max;
    }
}
