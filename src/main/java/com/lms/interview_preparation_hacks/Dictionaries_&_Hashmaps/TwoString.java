import java.io.*;
import java.util.*;

public class TwoString
{
    static String twoString(String s1, String s2)
    {
        int[] cache = new int[256];
        for (int i=0;i<s1.length();i++)
        {
            cache[(int) s1.charAt(i)]++;
        }
        
        for (int i=0;i<s2.length();i++)
        {
            if(cache[(int) s2.charAt(i)]!=0)
            {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            String s1=sc.next();
            String s2=sc.next();
            String result=twoString(s1, s2);
            System.out.println(result);
        }
    }
}