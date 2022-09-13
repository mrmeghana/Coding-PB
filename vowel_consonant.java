import java.lang.*;
import java.util.*;
import java.io.*;
public class vowel_consonant
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=str.toUpperCase();
        int countV=0;
        int countC=0;
        for(int i=0;i<str2.length();i++)
        {
            if(str2.charAt(i)=='A'|| str2.charAt(i)== 'E'||str2.charAt(i)=='I'||str2.charAt(i)=='O'||str2.charAt(i)=='U')
            {
                countV++;
            }
            else
            {
                countC++;
            }
        }
        System.out.println(countV +" "+countC);
    }
}