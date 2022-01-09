// Problem link : https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/Search in Rotated Sorted Array
//Problem No. 33


class Solution {
    public int search(int[] arr, int target) {
      int pivot=findPivotIndex(arr);
        int firstSide=binaySearch(arr,0,pivot,target);
        if(target==arr[pivot])
            return pivot;
        else if(firstSide != -1)
            return firstSide;
        return binaySearch(arr,pivot+1,arr.length-1,target);
    }
   int findPivotIndex(int[] arr)
   {
       int ans=-1;
       int start=0,end=arr.length-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           
            if(mid!=arr.length-1 &&arr[mid]>arr[mid+1])
                 return mid;
            else if(arr[start]>arr[mid])
                 end=mid-1;
            else if(mid!=arr.length-1&&arr[mid]<arr[mid+1])
                 start=mid+1;
            else
               return arr.length-1;
            
       }
       return ans;
   }
    int binaySearch(int[] arr,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else 
                start=mid+1;
        }
        return -1;
    }
}
