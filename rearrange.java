import java.io.*;
import java.util.*;
import java.lang.*;
public class rearrange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[1000000];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int count=0;
        while(i<=j)
        {
            if(count==0)
            {
                System.out.print(arr[j]+" ");
                j--;
                count=1;
            }
            else
            {
                System.out.print(arr[i]+" ");
                i++;
                count=0;
            }
        }
        System.out.print("\n");

    }
}
