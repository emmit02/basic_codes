import java.util.Scanner;
public class Jumping_on_the_cloud
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int rounds=sc.nextInt();
        int[] ar=new int[rounds];
        int i=0;
        
        for(i=0;i<rounds;i++)
        {
            ar[i]= sc.nextInt();
        }
        int count=0;
        i=0;
        while(i!=rounds-1)
        {
            if(i!=ar.length-2 && ar[i+2]==0)
            {
                i+=2;
            }
            else
            {
                i++;
            }
            count++;
        }
        System.out.print(count);
    }
}