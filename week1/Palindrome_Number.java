/* Problem description :
       Given a number we have to check if the number is Palindrome or not (Palindrome mean "if you reverse the number it remains same").
       
       1)In first case i gave if(x<0) means it's not a palidrome because eg: -121 o/p: 121- so, false.
       2) creating temporary variable to store given element.
       3)creating while loop for reverse that number using ('/' ,'%' ,*10).
       4)The '/' it removes the last element , '%' it returns the last element that we callled reminder.
       5)The "*10" using these make the number next digit not add eg: 12  -> (1 *10 )+2 =12   (not 1+2=3)
       6) then compare temporary varible to reverse variable.
       7)if both are same return true else false.

*/





public class Palindrome_Number {

	public static void main(String args[])
	{
		int num=121
		System.out.println(isPalindrom(num));
	}
  
   public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        int num = x;
        int rev = 0;
        while(x > 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        
        return (num == rev);
    }
}
}
