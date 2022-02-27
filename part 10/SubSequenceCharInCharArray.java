import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int wordNumber=scan.nextInt();
       String []word=new String[wordNumber];
       for(int i=0;i<wordNumber;i++)
       {
         word[i]=scan.next();
       }
       int m=scan.nextInt();
       int n=scan.nextInt();
       String[][] w=new String[m][n];
       for(int i=0;i<m;i++)
       {
         for(int j=0;j<n;j++)
         {
           w[i][j]=scan.next();
         }
       }
       
      
       
       for(int i=0;i<word.length;i++)
       {
        String answer="";
         char[] c=word[i].toCharArray();
         int cpointer=0;
          for(int ii=0;ii<m;ii++)
           {
             for(int j=0;j<n;j++)
              {
                if(cpointer==c.length)
                    break;
              if((""+c[cpointer]).equals(w[ii][j]))
                {
                    answer+=w[ii][j];
                    cpointer++;
               }
             }
           }
           if(cpointer==0)
             answer="-1";
           System.out.println(answer);
       }
       
       
    }
}
