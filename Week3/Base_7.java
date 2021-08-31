/* Problem Discription :
     Given a decimal number we need to convert it into base 7.
     1)in while loop divide and modulo run every time until the number become 0.
     2)if the given number is less then 0 than take absolute value of that number eg: -7 ans: 7 atlast we can change that number to negative.
     3)To store next to next number like (1+2 =12) not (1+2 =3) mutilpy 10 for each iteration
     4)return the number as string.
*/

class Base_7 {
    public String convertToBase7(int num) {
      int copy=num;
        if(num==0)
            return "0";
        if(num<0)
            num=Math.abs(num);
     int s=0,ans=1;
        while(num>0)
        {
           int mod=num%7;
            num/=7;
           s+=mod*ans;
            ans=ans*10;
        }
        return copy>0?Integer.toString(s):"-"+Integer.toString(s);
    }
}
