/* Problem Discription :
   Given a number we have to find whether these number is happy number or not .
   happry number means
        eg:19 
          1^2 + 9^2 = 82   ..split the given number and square it until the we get 1
          8^2 + 2^2 = 68
          6^2 + 8^2 = 100
          1^2 + 0^2 + 02 = 1
          if the number is 1 it is a happynumber
          creating Hashset to check if the number is alredy calculated or not if true means false because it retains the same doesn't give output.
          inside the while there is while loop for splitting and squaring that value.
          finally return the true.
*/

class Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1)
        {
            int sum=0;
            int current=n;
            while(current!=0)
            {
                sum+=(current%10)*(current%10);
                current/=10;
            }
            if(seen.contains(sum))
                return false;
            seen.add(sum);
            n=sum;
        }
        return true;
    }
}
