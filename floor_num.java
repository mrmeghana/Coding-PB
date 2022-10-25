import java.io.*;
import java.lang.*;
import java.util.*;
public class floor_num
{
    public static int floor(int x,int A[])
    {
        int temp=0;
        int flag=0;
        for(int i=0;i<A.length;i++)
        {
            if(x>=A[i])
            {
                temp=i;
            }
            else
            {
                flag++;
            }
        }
        if(flag==A.length)
        {
            return -1;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int A[]=new int[n];
            for(int i=0;i<n;i++)
            {
                A[i]=sc.nextInt();
            }
            System.out.println(floor(x,A));
        }
    }
}