import java.io.*;
import java.util.*;

public class LeftRotation
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int size=  sc.nextInt();
        int n = sc.nextInt();
        int[] ar=new int[size];
        
        
        for( int i = 0;i<size;i++)
        {
            if(n>i)
            {
                ar[size-n+i]=sc.nextInt();
            }
            else
            {
                ar[i-n]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+" ");
        }
         
    }
}
