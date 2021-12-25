public class MyClass {
    public static void main(String args[])
    {
        int a[]={1,2,2,2,2,3,4,5,5,6,7,8};
        int count=0,temp=-2;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                 count++;
                temp=a[i];
            }
        }
         System.out.print(a.length-count);
    }
}
