/*  Problem Discription :
       Given an sorted array it contains duplicate element. i need to sort the element by unique and the duplication are in the last and return finishing of last element.
      
      am intilize index for pointer to store in same array if duplicate are there mean it get ovveridden.
      1)am gonna loop whole element 
      2)if the current element is not equalto next element mean update that element in that array
      3)at last all element are sorted and return the last index of sorted array
    
*/

class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] )
                nums[index++]=nums[i+1];
        }
        return index;
    }
    
}
