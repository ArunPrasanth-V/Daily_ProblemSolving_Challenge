import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int num=scan.nextInt();
       int array[]=new int[num];
       for(int i=0;i<num;i++)
       {
         array[i]=scan.nextInt();
       }
       for(int q=0;q<num;q++)
       {
         int number=array[q];
         for(int i=0;i<=array[q];i++)
         {
           if(i==0)
             i++;
           for(int m=0;m<i;m++)
           {
             System.out.print("*");
           }
          
           for(int j=0;j<number*2-(i*2);j++)
           {
             System.out.print("#");
           }
           for(int m=0;m<i;m++)
           {
             System.out.print("*");
           }
           if(i==0)
           {
             i--;
           }
           System.out.println();
         }
         System.out.println();
       }
    }
}
