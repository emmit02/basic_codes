* * * * * * 
* *     * *
*         *
*         *
* *     * *
* * * * * *


import java.util.Scanner;
public class Symmetry {
    public static void symmetry(int n) 
    {
        //for lower
        int spaces=2*(n-1);
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=spaces;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }    

        //for lower
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j = 1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
            spaces-=2;
        }          
    }

    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }
}