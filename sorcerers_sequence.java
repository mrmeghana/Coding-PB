import java.io.*;
import java.util.*;
import java.lang.*;
public class sorcerers_sequence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int testcase;
        testcase=sc.nextInt();
        while(testcase--!=0)
        {
            long n=sc.nextLong();
            System.out.print(n+" ");
            double temp=n;
      
            while(temp!=1)
            {
                //2double res;
                if(temp%2==0)
                {
                        temp=(long)Math.floor(Math.sqrt(temp));
                        System.out.print((int)temp+" ");
                }
                else
                {
                    temp=(long)Math.floor(Math.sqrt(temp)*Math.sqrt(temp)*Math.sqrt(temp));
                    System.out.print((long)temp+" ");
                }
                //System.out.print(temp+" ");
            }
            System.out.print("\n");
        }
    }
}