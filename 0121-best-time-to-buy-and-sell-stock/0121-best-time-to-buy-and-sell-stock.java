class Solution {
    public int maxProfit(int[] prices) {
            int max = 0;
            int low = prices[0];
            int high = prices[0];
            if(prices.length < 1)
            return 0;
            for(int i=1; i<prices.length; i++)
            {
                if(prices[i] < low)
                {
                    low = prices[i];
                    high = prices[i];
                }
                else if(prices[i] > high)
                {
                    high = prices[i];
                    max = Math.max(high-low, max);
                }
            }
return max;
    }
}