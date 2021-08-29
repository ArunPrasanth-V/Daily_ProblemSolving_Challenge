/* Problem Discription :
      Given a String of positive number we need to add that number and print the result through string.
      1)get the string length,initally set carry as 0 and sum as 0
      2)create a while loop have to parse all number if any one string is >0. then inside that if condition for checking whether the element is or empty
      3)do modulo operation to get remainder 
      4)here am using stringbuffer because lot of update happening so, we need a mutable string 
      5)to get carry i divide that number by 10.
      6)finally check whether the carry is in zero or not. if not means add it in the string
      7)need to reverse the string because we are adding at last for every addtion.
*/
class Add_String_number {
    public String addStrings(String num1, String num2) {
   int l1=num1.length()-1;
   int l2=num2.length()-1;
        int carry=0;
        int sum=0;
    StringBuffer sb=new StringBuffer(); 
        while(l1>=0||l2>=0)
        {
            sum=carry;
            if(l1>=0)
                sum+=(num1.charAt(l1--)-'0');
            if(l2>=0)
                sum+=(num2.charAt(l2--)-'0');
            sb.append(sum%10);
            carry=sum/10;
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
