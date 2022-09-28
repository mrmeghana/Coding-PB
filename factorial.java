import java.io.*;
import java.util.*;
import java.lang.*;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            if(n==0)
            {
                fact=1;
            }
            else
            {
                fact=fact*i;
            }
        }
        System.out.println(fact);
    }
}
