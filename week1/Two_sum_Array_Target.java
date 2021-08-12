/*
Problem Description :
      Given an Array and Target element. we need to find in the array
which two element is the sum of target
   
    eg:array{1,2,5,3,4}  target=9
       Answer:5,4 in 2nd & 4th index
   
 MY APPROACH:
      First I created a Map which is key ,value pair
        1)I minus (-) current element with taget element
        2)Then, am going to search is the minus element is present in the Map or not.
        3)If it is present mean return the index 
        4)else add the current index and value (values as key and index as value)
        5)I repeat the same thing until the end.
             if 
                 it found mean return it.
             else
                 return -1,-1.  
          
     
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
 public static void main(String args[])
 {
	 int []arr= {2,3,7,4,8};
	 int target=7;
	 int temp[]=doCalc(arr,target);
	 for(int i:temp)
	 {//It Display that 2 element.
		System.out.println(i); 
     //The Program print that two Index
	 }
 }
  
  
  //Logic
public static int[] doCalc(int[] arr,int target)
{
	Map<Integer,Integer> collect=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		int delta=target-arr[i];
		if(collect.containsKey(delta))
		{
			return new int[] {collect.get(delta),i};
		}
		collect.put(arr[i],i);
	}
	return new int[] {-1,-1};
}
}
