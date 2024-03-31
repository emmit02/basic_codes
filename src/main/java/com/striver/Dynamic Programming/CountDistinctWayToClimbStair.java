Problem statement
You have been given a number of stairs. Initially, you are at the 0th stair, and you need to reach the Nth stair.



Each time, you can climb either one step or two steps.



You are supposed to return the number of distinct ways you can climb from the 0th step to the Nth step.

Example :
N=3
output=3



//solution



public class CountDistinctWayToClimbStair 
{
	public static final int MOD = 1000000007;

	public static long countDistinctWayToClimbStair(long n) 
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}
		
		long ans[] = new long[(int) (n + 1)];
		ans[0] = 1;
		ans[1] = 1;

		for (int i=2;i<= n;i++) 
		{
			ans[i] = (ans[i-1] + ans[i-2]) % MOD;
		}

		return ans[(int) n];
	}
}