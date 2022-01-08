// problem link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
//problem no : 852
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr,0,arr.length-1);
    }
int binarySearch(int[]arr,int start,int end)
   {
	   while(start<end)
	   {
		   int pos=start+(end-start)/2;
		
		   if(arr[pos]>arr[pos+1]) 
		       end=pos;
		   else 
		       start=pos+1;
		       
	   }
	   return start;
}
}
