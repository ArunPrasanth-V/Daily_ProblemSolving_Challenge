// https://leetcode.com/problems/count-primes/
// 204. Count Primes
class Solution {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        int count=1;
        boolean isPrime[]=new boolean[n];
        for(int i=3;i<n;i+=2){
            if(!isPrime[i]){
                count++;
                for(int j=2;i*j<n;j++){
                    isPrime[i*j]=true;
                }
            }
        }
        return count;
    }
}
