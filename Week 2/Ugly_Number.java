/* problem Discription :
      Given a number we have to find if the number is prime or not. if it's not a prime then it is a ugly number
      1)In case 1 if it is less then 0 then it should not prime number.
      2)remaining three case we are getting remainder unitl 1 or less then 1
      3)if it is one mean then it is a prime or not a prime
      
*/

class Ugly_Number {
    public boolean isUgly(int n) {
        if(n<1)return false;
        while(n%2==0) n=n/2;
         while(n%3==0) n=n/3;
         while(n%5==0) n=n/5;
        return n==1;
    }
}
