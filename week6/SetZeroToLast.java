public class MyClass {
    public static void main(String args[]) {
    int[] arr={1,0,0,0,5,0,7,8,9};
     int temp=0;
     for(int i=0;i<arr.length;i++)
     {
       if(arr[i]>0)
       {
           int a=arr[i];
           arr[i]=arr[temp];
           arr[temp]=a;
           temp++;
       }
     }
    
    for(int i:arr)
      System.out.println(i);
    }
}
