// https://leetcode.com/problems/search-in-rotated-sorted-array/
// 33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>=arr[left])
            {
                if(target<=arr[mid] && target>=arr[left] )
                    right=mid-1;
                else
                    left=mid+1;
            }
            else{
                if(target>=arr[mid] && target<=arr[right] )
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
}
