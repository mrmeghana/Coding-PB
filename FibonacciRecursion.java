import java.io.*;
import java.lang.*;
import java.util.*;
public class FibonacciRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}