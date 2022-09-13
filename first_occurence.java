//First Occurence of the Non-Repeating Character
//Optimized Approach
import java.io.*;
import java.lang.*;
import java.util.*;
public class first_occurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            String str=sc.next();
            int freq[]=new int[26];
            int flag=0;
            for(int i=0;i<str.length();i++)
            { 
               int a=freq[str.charAt(i)-97]++;
               
            }
            for(int i=0;i<str.length();i++)
            {
                if(freq[str.charAt(i)-97]==1)
                {
                    System.out.println(str.charAt(i));
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(-1);
            }

        }
    }
}