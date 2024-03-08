Problem statement
You are present at point ‘A’ which is the top-left cell of an M X N matrix, your destination is point ‘B’, which is the bottom-right cell of the same matrix. Your task is to find the total number of unique paths from point ‘A’ to point ‘B’.In other words, you will be given the dimensions of the matrix as integers ‘M’ and ‘N’, your task is to find the total number of unique paths from the cell MATRIX[0][0] to MATRIX['M' - 1]['N' - 1].

To traverse in the matrix, you can either move Right or Down at each step. For example in a given point MATRIX[i] [j], you can move to either MATRIX[i + 1][j] or MATRIX[i][j + 1].

//solution


import java.util.* ;
import java.io.*; 
public class UniquePaths {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		if (m == 1 || n == 1) {
			return 1;
		}

		return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
	}
}