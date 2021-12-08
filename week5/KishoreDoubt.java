public class MyClass {
    public static void main(String args[]) {
      for(int i=0;i<3;i++)
      {
          for(int j=0;j<i;j++)
          {
              System.out.print(" ");
          }
          for(int k=i;k<3;k++)
            System.out.print("#");
            System.out.println();
      }
    }
}
