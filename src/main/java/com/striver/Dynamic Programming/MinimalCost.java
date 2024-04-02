MinimalCost


Problem statement
There is an array of heights corresponding to 'n' stones. You have to reach from stone 1 to stone ‘n’.
From stone 'i', it is possible to reach stones 'i'+1, ‘i’+2… ‘i’+'k' , and the cost incurred will be | Height[i]-Height[j] |, where 'j' is the landing stone.
Return the minimum possible total cost incurred in reaching the stone ‘n’.
Example:
For 'n' = 3 , 'k' = 1, height = {2, 5, 2}.

Answer is 6.


//solution




public class MinimalCost 
{
    public static int minimizeCost(int n, int k, int []h)
    {
        return jump(n, k, h, 0);
    }

    public static int jump(int n, int k, int []h, int c)
    {
        if (c == n - 1)
        {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = c + 1; i <= c + k; i++)
        {
            if (i >= n)
            {
                break;
            }
            min = Math.min(min, Math.abs(h[c] - h[i]) + jump(n, k, h, i));
        }
        return min;
    }
}