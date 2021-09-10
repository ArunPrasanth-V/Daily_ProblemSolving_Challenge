/* Problem Discription :
   Given an array and 1 integer. To find no. of possible subArray when addition of element in array to form k.
   Input: nums = [1,1,1], k = 2 Output: 2//2  possible here 
   Input: nums = [1,2,3], k = 3 Output: 2
    here am using map function.
    //key as sum of element eg: "1 2 3 4"am at 2 index so sum is : 1+2+3=6
    //value is how many time the sum is occuered eg: here 6 occuered 1 time until 2nd index 
   1)inside a for loop am parsing all element whlie parsing suming the all element & check whether the current_sum is available in a map or not.
   2)if it is availble am just adding that map value in the result.
   3)if it not available am justing putting into map key as sum ..occuerance as 1 (value)
   4)here for adding and updating am using "mapname.put(sum,check.getOrDefault(sum,0)+1);" it will add if there is no key like that
   5) else update if key is there so it occuring another one time so add it.
*/
class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> check=new HashMap();
       check.put(0,1);
        int sum=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(check.containsKey(sum-k))
                   result+=check.get(sum-k);
              check.put(sum,check.getOrDefault(sum,0)+1);
            
        }
               return result;
    }
}
