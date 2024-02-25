1
2 2
3 3 3

import java.util.Scanner;
public class NTriangle1 {
    public static void nTriangle(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
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