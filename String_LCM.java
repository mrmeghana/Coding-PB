import java.io.*;
import java.lang.*;
import java.util.*;
public class Strings_LCM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String temp1=s;
        String temp2=t;
        while(true)
        {
        if(temp1.length()==temp2.length())
        {
            if(temp1.equals(temp2))
            {
                System.out.println(temp1);
                break;
                

            }
            else
            {
                System.out.println(-1);
                break;
                
            }
        }
        if(temp1.length()<temp2.length())
        {
            temp1=temp1+s;// temp1=temp1+temp1
            /*if(temp1.equals(temp2))
            {
                System.out.println(temp1);
            
            }*/
        }
        else
        {
            temp2=temp2+t; //temp2=temp2+temp2
            /*if(temp2.equals(temp1))
            {
                System.out.println(temp2);
            }*/
        
        }
    }
    }
}