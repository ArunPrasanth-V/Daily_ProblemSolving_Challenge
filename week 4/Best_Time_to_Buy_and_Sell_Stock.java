?*Problem Discription 
   Given an list of days of stock we need to buys the stack at low price and sell that at high price 
   Input: prices = [7,1,5,3,6,4] Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
      1)parse all the element and check which element is grater and whicher is lesser
      2) subtract grater - lesser (grater is selling day and lesser is a buying day
      3)print the result.
*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;
        int buy_day=Integer.MAX_VALUE;
        int sell_day=0;
        for(int i:prices)
        {
            if(i<buy_day)//lesser
                buy_day=i;
            else if((i-buy_day)>sell_day)
               sell_day=i-buy_day;
        }
        return sell_day;
    }
}
