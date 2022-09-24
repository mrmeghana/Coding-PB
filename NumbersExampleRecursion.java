import java.io.*;
import java.lang.*;
import java.util.*;
public class NumbersExampleRecursion
{
    public static void main(String[] args)
    {
        print(1);
    }
    static void print(int n)
    {
        if(n>5)
        {
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}