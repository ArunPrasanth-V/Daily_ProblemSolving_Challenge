//Leetocde Problem Number 34
//   https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] arr, int target) {
      
        return new int[]{search(arr,target,true),search(arr,target,false)};
    }
    int search(int[] arr,int target,boolean isFirstElement)
    {
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
                end=mid-1;
            else if(arr[mid]<target)
                start=mid+1;
            else
            {
                
                ans= mid;
                if(isFirstElement)
                    end=mid-1;
                else 
                    start=mid+1;
            }
        }
        return ans;
    }
   
}
