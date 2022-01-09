public class MyClass {
    public static void main(String args[]) {
        int arr[]={3,1};
       System.out.print(findPivotIndex(arr)+1);
    }
  static  int findPivotIndex(int[] arr)
   {
       int start=0,end=arr.length-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           
            if(mid!=arr.length-1 &&arr[mid]>arr[mid+1])
                 return mid;
            else if(arr[start]>arr[mid])
                 end=mid-1;
            else if(mid!=arr.length-1&&arr[mid]<arr[mid+1])
                 start=mid+1;
            else
               return -1;
            
       }
       return -1;
   }
}
