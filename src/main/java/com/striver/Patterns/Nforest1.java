*
* * 
* * * 

import java.util.Scanner;
public class Nforest1 {
    public static void nForest(int n) 
    {
        for(int i=1;i<=n;i++)
        {
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