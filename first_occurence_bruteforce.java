import java.io.*;
import java.util.*;
import java.lang.*;
public class first_occurence_bruteforce
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            for(int j=i+1;j<n;j++)
            {
                if(str.charAt(j)==ch)
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
            {
                System.out.println(ch);
                break;
            }
        }

    }
}