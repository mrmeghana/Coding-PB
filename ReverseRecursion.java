import java.io.*;
import java.lang.*;
import java.util.*;
public class ReverseRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //Now we got string;
        int n=str.length();
        char temp[]=str.toCharArray();
        String a=new StringBuilder(str).reverse().toString();
        System.out.println(a);
    }
}