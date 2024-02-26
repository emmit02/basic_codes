A
A B
A B C

import java.util.Scanner;

public class NLetterTriangle {
    public static void nLetterTriangle(int n) {
        
        for(int i=1;i<=n;i++)
        {
            char ch=65;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println();
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
    }
}
