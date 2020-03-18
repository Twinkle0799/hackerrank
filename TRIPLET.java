import java.util.*;
public class GFG
{
    public static final int size=3;
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            b[i]=sc.nextInt();
        }
        int alice=0;
        int bob=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]>b[i])
            {
                alice=alice+1;
            }
            else if(a[i]<b[i])
            {
                bob=bob+1;
            }
        }
        System.out.print(alice+" "+bob);
        
    }
}
