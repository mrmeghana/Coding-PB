import java.io.*;
import java.lang.*;
import java.util.*;
public class PatternRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pattern(n));
    }
    public static int pattern(int n)
    {
        if(n<=0 && n<n)
        {
            n=n+5;
            return(n);
        }
    }
}