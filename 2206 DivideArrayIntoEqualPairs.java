// 2206. Divide Array Into Equal Pairs
// https://leetcode.com/problems/divide-array-into-equal-pairs/
class Solution {
    public boolean divideArray(int[] in) {
       boolean bool[]=new boolean[in.length];
	   int count=0;
	   for(int i=0;i<in.length;i++) {
		   for(int j=i+1;j<in.length;j++) {
			   if(in[i]==in[j]&& bool[i]!=true&& bool[j]!=true) {
				   count++;
				   bool[i]=true; 
				   bool[j]=true;
			   }
		   }
	   }
	   
	   return count==(in.length/2);
    }
}
