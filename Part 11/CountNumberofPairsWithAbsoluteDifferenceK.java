// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
// 2006. Count Number of Pairs With Absolute Difference K
class Solution {
    public int countKDifference(int[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]-arr[j]==k)
                    count++;
            }
        }
        return count;
    }
}
