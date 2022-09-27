import java.io.*;
import java.lang.*;
import java.util.*;
public class first_capital_letter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char temp[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                System.out.println(i);
                break;
            }
        }
    }
}

