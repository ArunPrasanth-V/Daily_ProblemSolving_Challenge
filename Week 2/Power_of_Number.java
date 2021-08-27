/*Problem Description
      Given a number n and x we have to find if n is the power of x or not.
        Input: n = 16, x=4  Output: true
        1)here am using the very simple math  logX(n)=x .I rewritten as below Code
              %1==0 -> it checks the given number is whole number or not.
 */
class Power_of_Number {
    public boolean isPowerOfFour(int n,int x) {
        return Math.log(n)/Math.log(x)%1==0;
    }
}
