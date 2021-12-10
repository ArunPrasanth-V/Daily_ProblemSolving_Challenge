class MyClass {
    public static void main(String args[]) {
      
      int n=7;
      int orgn=n;
      int t=n*n;
      int temp=1;
      for(int i=1;i<=orgn*orgn;i++)
      {
          if(i<=n)
          {
              System.out.print(i+" ");
          }
          else
          {
              i=(temp*10);
              temp++;
              n=temp*10-(10-orgn);
          }
          
      }
      temp=1;
      System.out.println();
      
      for(int i=orgn+1;i<=t;i++)
      {
          if((i<=temp*10) && i<t)
          {
              System.out.print(i+" ");
          }
          else
          {
              i=(temp*10)+(orgn);
              temp++;
              n=temp*10;
          }
      }
      
      
      
    }
}
