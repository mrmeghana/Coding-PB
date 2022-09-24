import java.io.*;
import java.util.*;
import java.lang.*;
public class SumRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return n+sum(n-1);
    }
}