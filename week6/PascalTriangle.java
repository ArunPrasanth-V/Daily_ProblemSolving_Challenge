public class MyClass {
     public static void main(String args[]) {
      int arr[][]=new int[5][5];
      int j=0;
      arr[0][0]=1;
      for(int i=1;i<5;i++)
      {
          arr[i][0]=1;
          j=1;
          for(j=1;j<i;j++)
          {
              arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
              
          }
          arr[i][j]=1;
      }
      
      
      for(int i[]:arr)
      {
          for(int a:i)
          {
              System.out.print(a+" ");
          }
          System.out.println();
      }
    }
}
