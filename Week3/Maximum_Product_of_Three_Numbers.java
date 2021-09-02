/*Problem Description :
 Given an unsorted array it may contain both positive value and negative value we have to written by multiplying the 3 number to get highest number.
 eg:  Input: nums = [1,2,3,4]  Output: 24
            ny multiplying the number 2,3,4 we get 24 as the answer.
          1)insde a for i'm finding first 3 maximun munber in array
          2)find 2 least number in that array
          3)why am taking 1st 3 max number mean if we are multiplying that 3 number we may get the answer
          4)i'm takking lest value in case 2 least value is very low eg:-123,-999 if we multiply that number means we get high positive number 
             so,am taking 2 low + 1 high we may get high number
          5)compare step 3 and step 4 return the maximum element

*/
class SMaximum_Product_of_Three_Numbers {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i:nums)
        {
            //for max value
          if(i>max1)
          { max3=max2; max2=max1; max1=i;}
          else if(i>max2)
          { max3=max2; max2=i; }
          else if(i>max3)
             max3=i;
         
            //for min value in case of minus
        if(i<min1)
         {  min2=min1; min1=i; }
        else if(i<min2)
             min2=i; 
        }
        int answer1=max1*max2*max3;
        int answer2=max1*min1*min2;//*min3;
        return Math.max(answer1,answer2);
    }
}
