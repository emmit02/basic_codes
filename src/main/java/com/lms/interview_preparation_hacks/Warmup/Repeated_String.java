import java.util.Scanner;
public class Repeated_String
{
    public static void main(String argd[])
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        long n=sc.nextLong();
        long num = n/s.length();
        long r = n%s.length();
        long count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                count+=num;
                if(i<r)
                {
                    count++;
                }  
            }
            
        }
        System.out.println(count);
    }
}