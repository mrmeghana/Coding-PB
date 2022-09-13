import java.io.*;
import java.util.*;
import java.lang.*;
public class bablu_dablu
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase--!=0)
        {
        int n=sc.nextInt();
        int temp=n%8;
        if(temp==0)
        {
            System.out.println((n-1)+"SL");
        }
        else if(temp==1)
        {
            System.out.println((n+3)+"LB");
        }
        else if(temp==2)
        {
            System.out.println((n+3)+"MB");
        }
        else if(temp==3)
        {
            System.out.println((n+3)+"UB");
        }
        else if(temp==4)
        {
            System.out.println((n-3)+"LB");
        }
        else if(temp==5)
        {
            System.out.println((n-3)+"MB");
        }
        else if(temp==6)
        {
            System.out.println((n-3)+"UB");
        }
        else if(temp==7)
        {
            System.out.println((n+1)+"SU");
        }
    }
        
        
    }
}