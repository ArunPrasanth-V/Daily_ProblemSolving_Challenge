/* Problem Discription :
     Given an unsorted array we have to find how many move it takes to sort that arrray.
     1)to find the minimum value present in the array
     2)subtract with each element present in that array
     3)we get the answer.
*/
class Minimum_Moves_to_Equal_Array_Elements {
    public int minMoves(int[] nums) {
       int min=Integer.MAX_VALUE;
        for(int i:nums)
            min=Math.min(min,i);
        int res=0;
        for(int i:nums)
            res+=i-min;
        return res;
    }
}
