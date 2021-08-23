/*  Problem Discription :
      Given number we have to find how many number are prime or not
       Input: n = 10
       Output: 4
       Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

     1)I created an array of boolean initially i make it as true.
     2)In 2nd for loop I start from the 2 because in programming prime number are start from the 2 . 
     3)I parse each number to the loop.here am given number *same number make it as false because that number is divible by that given number eg: 2*2=4 i make 4 as flase
     4)in the same i parse all element. 
     5)finally i count the how many number are true and return that count.
*/


class Count_prime {
    public int countPrimes(int n) {
        boolean b[]=new boolean[n];
        for(int i=0;i<n;i++)
           b[i]=true;
        for(int i=2;i*i<n;i++)
        {
            if(b[i])
            {
                for(int j=i;j*i<n;j++)
                    b[i*j]=false;  
            }
        }
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(b[i])
                count++;
                
        }
        return count;
    }
}
