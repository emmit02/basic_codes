A B C
A B
A

import java.util.Scanner;

public class NLetterTriangle1 {
    public static void nLetterTriangle(int n) {
        
        for(int i=n;i>=1;i--)
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
