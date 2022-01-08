public class MyClass {
    public static void main(String args[]) {
      int arr[]={1,2,4,5,7,8,11,13,15,16,18};
      int target=7;
      int start=0,end=1;
      while(arr[end]<target)
      {
          int temp=end;
          end=(end+1)*2;
          start=temp+1;
      }
      System.out.print(binarySearch(arr,start,end,target));
      
    }
   static int binarySearch(int arr[],int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
         if(target>arr[mid])
             start=mid+1;
         else if(target<arr[mid])
             end=mid-1;
            else 
            return mid;
        }
        return -1;
    }
    
      
}
