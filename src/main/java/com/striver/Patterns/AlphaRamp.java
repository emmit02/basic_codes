A
B B
C C C

import java.util.Scanner;

public class AlphaRamp {
    public static void alphaRamp(int n) {
        char ch=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
    }
}
