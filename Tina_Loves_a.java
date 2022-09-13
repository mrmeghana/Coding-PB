import java.io.*;
import java.lang.*;
import java.util.*;
public class Tina_Loves_a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=str.toLowerCase();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(str2.charAt(i)=='a')
            {
                count++;
            }
        }
        if(count>n/2)
        {
            System.out.println(n);
        }
        else
        {
            if((2*count-1)>n)
            {
                System.out.println(n);
            }
            else
            {
                System.out.println((2*count)-1);
            }
        }
    }
}