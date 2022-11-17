import java.io.*;
import java.util.*;
import java.lang.*;
public class rotate_and_find
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int flag=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==x)
                {
                    flag=1;
                    System.out.println(i);
                }
            }
            if(flag!=1)
            {
                System.out.println("-1");
            }
        }
    }
}