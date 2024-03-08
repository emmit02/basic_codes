Problem statement
You are given an integer ‘N’. You need to return the first ‘N’ rows of Pascal’s triangle.

Example:

Input:
N = 4
Output:
1
1 1
1 2 1
1 3 3 1
Explanation: The output matrix has the first four rows of Pascal’s Triangle. 




//solution




import java.util.*;
public class PascalTriangle {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int [][]ans = new int[N][];
        
        for(int i=0;i<N;i++)
        {
            ans[i] = new int[i + 1];
            ans[i][0] = 1;
            ans[i][i] = 1;

            for (int j = 1; j < i; j++) 
            {
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }

        return ans;
    }
}