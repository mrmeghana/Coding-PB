import java.io.*;
import java.lang.*;
import java.util.*;
public class Playing_Cards
{
    
    public static void main(String[] args)
    {
//write your code here
      Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        
        //int flag=0;
        String str2[]=new String[5];
        for(int i=0;i<str2.length;i++)
        {
            str2[i]=sc.next();
        }
        int flag=0;
        for(int i=0;i<str2.length;i++)
        {
            if(str1.charAt(0)==str2[i].charAt(0))
            {
                flag=1;
                break;
            }
            if(str1.charAt(1)==str2[i].charAt(1))
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}