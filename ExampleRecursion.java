import java.io.*;
import java.lang.*;
import java.util.*;
public class ExampleRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        example(n);
    }
    static void example(int n)
    {
        if(n<0)
           return;
        System.out.printf("%d",n);
        example(n-1);
        System.out.printf("%d\n",n);

    }
}
