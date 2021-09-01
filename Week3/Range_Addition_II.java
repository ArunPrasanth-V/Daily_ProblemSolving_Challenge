/* Problem Discription :
 Given an 2D array and input we need to add from that many index that they are given in the input
  1)parshing each element and get minimum
  2) multipy n*b to get the answer.

*/
class Range_Addition_II {
    public int maxCount(int m, int n, int[][] ops) {
                for(int[] op:ops)
                {
                    m=Math.min(m,op[0]);
                    n=Math.min(n,op[1]);
                }
        return m*n;
    }
}
