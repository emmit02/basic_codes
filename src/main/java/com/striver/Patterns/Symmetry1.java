*         *
* *     * *
* * * * * *
* *     * *
*         *

import java.util.Scanner;
public class Symmetry1 {
    public static void symmetry(int n) 
    {
        for(int i=1;i<=n;i++) 
        {
            for(int j=1;j<=i;j++) 
            {
                System.out.print("* ");
            }

            for(int j=2*(n-i);j>0;j--)
            {
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=n-1;i>=1;i--) 
        {
            // Print '*' for the first half of the pattern
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            for(int j=2*(n-i);j>0;j--) 
            {
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }
}



1-   2,3,16
2-   5,19