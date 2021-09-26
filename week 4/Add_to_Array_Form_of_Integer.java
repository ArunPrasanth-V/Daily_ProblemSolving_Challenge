/* Problem Description :
    Given an Array and Integer we need to add both & return in a array format as a Single element in each index.
    Input: num = [1,2,0,0], k = 34             num = [0], k = 34
           Output: [1,2,3,4]                   Output: [3,4]
   Explanation: 1200 + 34 = 1234
   1)prase from last element of the array and sum it with k's last digit and carry      sum=(arr[i]+k%10+carry)
   2)add the sum last digit into 0th index arraylist. if we adding elment in 0th index 2nd time previous 0th index value move to 1th position.
   3)add the value carry if the number is grater then 9.
   4)prase util array index become 0 , k become 0 and carry become 0.
   
*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        List<Integer> arr=new ArrayList<>();
        int i=num.length-1;
        int sum=0;
      while(i>=0||k>0||carry>0)
       {
         int val=(i>=0?num[i]:0)+(k>0?k%10:0)+carry;  
          carry=val/10;
          arr.add(0,val%10);
          i--;k/=10;
      }
   // Collections.reverse(arr);
     return arr;
    }
}
