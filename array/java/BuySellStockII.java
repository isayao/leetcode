public class BuySellStockII
{
    public static int maxProfit(int[] prices)
    {
        int profit = 0;
        for (int i=1; i<prices.length; i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] agrs)
    {
        int[] prices = {1, 7, 2, 3, 6, 7, 6, 7}; 
        int res = maxProfit(prices);
        System.out.println("Profit: " + res);
    }
}