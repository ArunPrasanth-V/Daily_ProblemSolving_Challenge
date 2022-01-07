//Leetcode Problem No. 744

class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                if(mid==arr.length-1)
                    return arr[0];
            }
            if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
     if(start==arr.length)
            return arr[0];
     else
         return arr[start];
    }
}
