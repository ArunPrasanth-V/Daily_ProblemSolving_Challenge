class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int current=arr[i]-1;
            if(i!=current&& arr[current]!=arr[i])
            {
                swap(arr,i,current);
            }
            else
                i++;
                
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]-1 != j)
                return arr[j];
        }
        return -1;
        
    }
    void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
