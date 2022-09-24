import java.io.*;
import java.lang.*;
import java.util.*;
public class ReverseRecursion2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //Now we got string;
        int n=str.length();
        char temp[]=str.toCharArray();
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(temp[i]);
        }
    }
}