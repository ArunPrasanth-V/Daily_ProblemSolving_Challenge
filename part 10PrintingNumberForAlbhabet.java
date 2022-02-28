public class Main
{
	 public static void main(String[] args) {
       int arr[]={1,3};
       char c='E';
       int preValue=arr[arr.length-1];
       int number=65;
       for(int i:arr)
       {
         System.out.println((char)number++ +" : "+i);   
       }
       
       for(int i=64+preValue;i<=c;i++)
       {
           int n=(i-64)*preValue+preValue;
           System.out.println((char)i+" : "+n);   
           preValue=n;
       }

    }
}
