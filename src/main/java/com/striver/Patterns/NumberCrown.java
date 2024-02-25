1  1
12 21
123321

import java.util.Scanner;
public class NumberCrown 
{    
    public static void numberCrown(int n) 
    {
        int spaces = 2*(n-1);
   
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j = 1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            spaces-=2;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
    }
}