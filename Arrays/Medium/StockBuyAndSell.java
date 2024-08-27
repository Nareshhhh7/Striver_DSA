public class StockBuyAndSell
{
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    static int maxProfit(int[] arr)
    {
        int minimum = arr[0];
        int profit = 0;
        int buy = 0;

        for(int i = 1; i<arr.length; i++)
        {
            buy = arr[i] - minimum;
            profit = Math.max(buy, profit);
            minimum = Math.min(minimum, arr[i]);
        }
        return profit;
    }
}
