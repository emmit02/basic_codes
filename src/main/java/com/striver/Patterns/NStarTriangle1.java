*****
 *** 
  *
import java.util.Scanner;

public class NStarTriangle1 {
    public static void nStarTriangle(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i;j>=1;j--) 
            {
                System.out.print(" ");
            }
            for(int k=2*i-1;k>=1;k--) 
            {
                System.out.print("*");
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