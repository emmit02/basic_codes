Problem statement
You are given a matrix 'MATRIX' of dimension 'N' x 'M'. Your task is to make all the elements of row 'i' and column 'j' equal to 0 if any element in the ith row or jth column of the matrix is 0.

Note:

1) The number of rows should be at least 1.

2) The number of columns should be at least 1.

3) For example, refer to the below matrix illustration: 



//solution



import java.util.ArrayList;
public class ZeroMatrix {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Create two ArrayList for the row and column indicator.
        ArrayList<Boolean> row = new ArrayList<Boolean>(n);
        ArrayList<Boolean> col = new ArrayList<Boolean>(m);

        for (int i = 0; i < n; i++) {
            row.add(false);
        }
        for (int j = 0; j < m; j++) {
            col.add(false);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row.set(i, true);
                    col.set(j, true);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row.get(i) || col.get(j)) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}