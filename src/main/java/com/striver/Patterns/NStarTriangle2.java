*
**
***
**
*

import java.util.Scanner;
public class NStarTriangle {
    public static void nStarTriangle(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
    }
}