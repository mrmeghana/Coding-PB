import java.io.*;
import java.util.*;
import java.lang.*;
public class char_count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int freq[]=new int[26];
        
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-97]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(freq[str.charAt(i)-97]>1)
            {
                System.out.println(str.charAt(i)+"="+freq[str.charAt(i)-97]);
                //break;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
    }
}