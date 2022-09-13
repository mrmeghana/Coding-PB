import java.io.*;
import java.lang.*;
import java.util.*;
public class chatur
{
    public static int chaturspaper(String s)
    {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                sum=sum+Math.abs(s.charAt(i)-s.charAt(n-i-1));
            }

        }
        return sum;
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            String s=new String();
            s=sc.next();
            int p=chaturspaper(s);
            System.out.println(p);

        }

    }
}