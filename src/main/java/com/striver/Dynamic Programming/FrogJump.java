FrogJump

Problem statement
There is a frog on the '1st' step of an 'N' stairs long staircase. The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair. Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.

For Example
If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.


//solution



public class FrogJump 
{
	private static int rec(int i, int h[], int x[]) 
	{
		if (i == h.length - 1)
		{
			return 0;
		}
	
		if(x[i] != -1)
		{
			return x[i];
		}
	
		int one = Integer.MAX_VALUE;
		int two = Integer.MAX_VALUE;
	
		if (i + 1 < h.length)
		{
			one = Math.abs(h[i] - h[i + 1]) + rec(i + 1, h, x);
		}
	
		if (i + 2 < h.length)
		{
			two = Math.abs(h[i] - h[i + 2]) + rec(i + 2, h, x);
		}
	
		int ans = Math.min(one, two);
		x[i] = ans;
		return ans;
	}

	public static int frogJump(int n, int h[]) 
	{
		int x[] = new int[n+1];
		for (int i = 0; i <= n;i++)
		{
			x[i] = -1;
		}
		int ans = rec(0, h,x);
		return ans;
	}
}