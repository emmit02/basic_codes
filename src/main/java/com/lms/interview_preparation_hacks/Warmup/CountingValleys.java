import java.util.Scanner;
public class CountingValleys
{
    public static void main( String arg[])
    {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String s= sc.next();
        
        int level=0;
        int valleys=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
            {
                level++;
            }
            else if(s.charAt(i)=='D')
            {
                if(level==0)
                {
                    valleys++;
                }
                level--;
            }
        }
        System.out.println(valleys);
    }
}