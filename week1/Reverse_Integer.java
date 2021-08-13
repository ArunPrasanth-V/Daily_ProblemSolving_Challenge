/*   Problem discription :
             Given an Integer we have to that integer eg: 871 o/p:178
             
 1) am beaking the whole integer into single digit by "%" and add it in  the new integer.
 2) (rev=rev*10+a%10)//here am multiplying with "10". so at the next addition it becomes second digit (not  add like 8+7=15 ) 
 3) After added last digit in a new Integer then, eleminate the last digit in that old integer using (/)
 4) am repeating these process until the old integer become empty.
*/

public class Reverse_Integer {

	 public static void main(String args[])
	 {
		 System.out.println(doreverse(-1234));
	 }
  
  
  
  
	 public static int doreverse(int a)
	 {
		long reverse=0;
		 while(a!=0)
		 {
			 reverse=reverse*10+a%10;
			 a/=10;
			 if(reverse>Integer.MAX_VALUE||reverse<Integer.MIN_VALUE)
				 return 0;
		 }
		
		 return (int)reverse;
	 }
}
