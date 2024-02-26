    A
  A B A
A B C B A

import java.util.Scanner;
public class AlphaHill {
    public static void alphaHill(int n) 
    {

        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("  ");
            }

            int ch=(int) 'A';
            for(int j=0;j<=i;j++) 
            {
                System.out.print((char) (ch+j)+" ");
            }
            for(int j=i-1;j>=0;j--) 
            {
                System.out.print((char) (ch+j)+" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
    }
}