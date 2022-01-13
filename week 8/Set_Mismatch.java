class Solution {
    public int[] findErrorNums(int[] arr) { 
       int i=0;
       while(i<arr.length)
       {
           if(arr[i]-1 !=i && arr[i]!=arr[arr[i]-1])
           {
               swap(arr,i,arr[i]-1);
           }
           else
               i++;
       }
      int[] al=new int[2];
       for(int j=0;j<arr.length;j++)
       {
           if(arr[j]-1!=j){
               al[0]=arr[j];
               al[1]=j+1;}
       }
       return al;
   }
   void swap(int arr[],int start,int end)
   {
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
   }
}
