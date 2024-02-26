1
2 3
4 5 6

import java.util.Scanner;
public class NNumberTriangle1 {
    public static void nNumberTriangle(int n) {
        
        int count=1;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
    }
}