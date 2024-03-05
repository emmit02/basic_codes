Problem statement
You are given an array of integers 'prices' of size 'n', where ‘prices[i]’ is the price of a given stock on an ‘i’-th day.



You want to maximize the profit by choosing a single day to buy one stock and a different day to sell that stock.



Please note that you can’t sell a stock before you buy one.



Return the maximum profit you can achieve from this transaction.



Example :
Input: ‘prices’ =[7, 1, 5, 4, 3, 6]

Output: 5



//solution



import java.util.*;
public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int max=0;
        int minPrice=Integer.MAX_VALUE;

        for(int i=0; i<prices.length;i++)
        {
            minPrice=Math.min(minPrice, prices[i]);
            max=Math.max(max, prices[i]-minPrice);
        }
        return max;
    }
}
