import java.io.*;
import java.lang.*;
import java.util.*;
public class perfect_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0)
        {
            int num=sc.nextInt();
            int sum=0;
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                {
                    sum=sum+i;
                }
            }
            if(sum==num)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}