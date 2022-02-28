import java.util.*;
public class Main
{
	  public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int number=scan.nextInt();
          String arr[]=new String[number];
          for(int i=0;i<number;i++)
          {
              arr[i]=scan.next();
          }
          for(int s=0;s<arr.length;s++)
          {
            String word=arr[s];
            int max=0;
             for(int i=0;i<word.length();i++)
             {
               int count=0;
               while(i<word.length()-1&& word.charAt(i)=='R' && word.charAt(i+1)=='K')
               {
                 count+=2;
                 i+=2;
                 
               }
               if(count>max)
                 max=count;
             }
             
             System.out.println(max);
          }
	  }
}
