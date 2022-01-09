//this solution work only if the array is sorted and array may or may not rotated
public class MyClass {
    public static void main(String args[]) {
     int arr[]={6,7,8,0,1};
        System.out.print(findPivotIndex(arr));
    }
  static  int findPivotIndex(int[] arr)
   {
       int ans=-1;
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
               return arr.length-1;
            
       }
       return ans;
   }
}
