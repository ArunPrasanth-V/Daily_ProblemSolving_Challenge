public class MyClass {
    public static void main(String args[]) {
     int n=6;
     int orgn=n,nn=n*n;
     
     for(int i=1;i<=nn;i++)
     {
         if(i<=n)
         System.out.print(i+" ");
         else
         {
             i+=orgn-1;
             n+=orgn+orgn;
         }
     }
     int temp=orgn+orgn;
     
     for(int i=orgn+1;i<=nn;i++)
     {
         if(i<=temp)
          System.out.print(i+" ");
          else
          {
              i+=orgn-1;
              temp+=orgn+orgn;
          }
          
     }
    }
}
