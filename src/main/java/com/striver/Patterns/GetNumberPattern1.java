4444444
4333334
4322234
4321234
4322234
4333334
4444444

import java.util.Scanner;
public class GetNumberPattern1 {
    public static void getNumberPattern(int n) 
    {
        int size = 2 * n - 1;

        int[][] arr = new int[size][size];

        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < size - i; j++) 
            {
                arr[i][j] = n-i;
                arr[size-1-i][j] = n-i;
                arr[j][i] = n-i;
                arr[j][size-1-i] = n-i;
            }
        }

        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=  sc.nextInt();
    }
}