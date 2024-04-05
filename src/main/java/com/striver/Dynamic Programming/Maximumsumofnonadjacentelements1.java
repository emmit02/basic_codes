Problem statement
You are given an array/list of ‘N’ integers. You are supposed to return the maximum sum of the subsequence with the constraint that no two elements are adjacent in the given array/list.

Note:
A subsequence of an array/list is obtained by deleting some number of elements (can be zero) from the array/list, leaving the remaining elements in their original order.


//solution



import java.util.ArrayList;

public class  Maximumsumofnonadjacentelements {
	private static int maxNonAdjacentSumHelper(ArrayList<Integer> nums, int index) {
		if (index < 0) {
			return 0;
		}
		int optionA = maxNonAdjacentSumHelper(nums, index - 2) + nums.get(index);

		int optionB = maxNonAdjacentSumHelper(nums, index - 1);

		return Math.max(optionA, optionB);
	}

	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n = nums.size();
		return maxNonAdjacentSumHelper(nums, n - 1);
	}
}