public class MyClass {
    public static void main(String args[]) {
      int arr[]={1,2,4,5,7,8,11,13,15,16,18};
      int target=14;
     System.out.print(binaySearch(arr,target));
      
    }
    static int  binaySearch(int arr[],int target)
    {
        int start =0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
                  end=mid-1;
            else if (arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
            
        }
        return start;
    }
}
