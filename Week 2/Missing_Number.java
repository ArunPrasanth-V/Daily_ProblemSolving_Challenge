/*Problem Discription :
   Given a unsorted number array start from 0 to n inbetween or at the end number is missing i have find what it is.
   Input: nums = [3,0,1] Output: 2
     1)I'm going to sum whole array element . 
     2)store array length +1. why these mean to find how many number including missing number.
     3)n*(n-1)/2 these formula gives total number 
     4)I'm going to minus the total number - sum
     5)then it return remaining number
*/
class Missing_Number {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        int n=nums.length+1;
        return n*(n-1)/2 -sum;
    }
}
