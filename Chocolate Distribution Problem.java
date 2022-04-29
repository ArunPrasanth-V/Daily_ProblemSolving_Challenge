//Chocolate Distribution Problem
//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        Long min=Long.MAX_VALUE;
        long aPointer=0;
        long bPointer=m-1;
        while(bPointer<a.size())
        {
            Long val=a.get((int)bPointer)-a.get((int)aPointer);
            min=Math.min(val,min);
            aPointer++;
            bPointer++;
        }
        return min;
    }
}
