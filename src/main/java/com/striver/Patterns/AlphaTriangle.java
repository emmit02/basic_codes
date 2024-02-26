C
C B
C B A

import java.util.Scanner;
public class AlphaTriangle {
    public static void alphaTriangle(int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--) 
            {
                char ch=(char) ('A'+j);
                if(j>=n-i-1)
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    }
}