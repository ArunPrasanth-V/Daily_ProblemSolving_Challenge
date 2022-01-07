//Leetcode Problem No. 744
//   https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
           
            if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
         return arr[start % arr.length];
    }
}
