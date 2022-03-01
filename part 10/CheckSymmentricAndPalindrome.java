import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
	   int len=str.length();
	   if(len%2!=0)
	       System.out.println("It is not Symmetrical");
	   else{
	      String s1=str.substring(0,str.length()/2);
	      String s2=str.substring((str.length()/2)+1);
	      if(s1==s2)
	          System.out.println("Symmetrical");
	      else
	      System.out.println("It is not Symmetrical");
	   }
	   {
	       if( palidome(str))
	         System.out.println("Panlidrom");
	       else
	         System.out.println("NOt Panlidrom");
	   }
	   
	}
	public static boolean palidome(String original)
	{
	    String reverse = "";
      	int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
            return true;
      else  
           return false;
	}
}
