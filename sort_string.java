import java.io.*;
import java.lang.*;
import java.util.*;
public class sort_string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
        String str=sc.next();
        str.toLowerCase();
        char arr[]=str.toCharArray();
        int n=arr.length;
        char temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    }
}
