class Solution {
    public int firstMissingPositive(int[] arr) {
       int i=0;
       while(i<arr.length)
       {
           if(arr[i]<arr.length&&arr[i]>0 && arr[i]-1 !=i && arr[i]!=arr[arr[i]-1])
           {
               swap(arr,i,arr[i]-1);
           }
           else
               i++;
       }
       for(int j=0;j<arr.length;j++)
       {
           if(arr[j]-1!=j){
               return j+1;}
       }
       return arr.length+1;
   }
   void swap(int arr[],int start,int end)
   {
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
   }
}
