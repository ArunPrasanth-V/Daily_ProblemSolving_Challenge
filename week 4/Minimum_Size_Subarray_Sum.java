/* Problem discription :
  Given an array and one integer(s) we we have to find by adding all the element in the sub-array of the given array. we get that integer(s) or more then that integer(s)
   
   1)Parse all the array element in loop and add one by one that is total sum
   2)while adding i'm checking whether total sum is grater then or equal to that element or not.
   3)if it is grater then or equal then, parsing inside one while loop
   4)these loop is for taking minimum length
   5)here am degrementing the element from the sub- array staring index and form total sum as well decrementing starting index value store length in res
   6)and check now also wheather it is grater then or equal. if it is true do agin and agin 
   7)finally return the lenght. "at starting i don't know the mininum length".so am taking integer's max value 
   8)if res not equals to integer.Max_Length then return res else return 0
*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                res=Math.min(res,i+1-left);
                sum-=nums[left];
                left++;
            }
        }
        return res !=Integer.MAX_VALUE?res:0;
    }
}
