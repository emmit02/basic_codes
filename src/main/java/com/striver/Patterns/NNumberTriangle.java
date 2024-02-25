1 2 3
1 2
1

import java.util.Scanner;
public class NNumberTriangle {
    public static void nNumberTriangle(int n) 
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
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