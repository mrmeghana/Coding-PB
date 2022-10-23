import java.io.*;
import java.lang.*;
import java.util.*;
public class difficulty_question
{
    public static int question(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                return -1;
            }
        }
        return 0;
    }
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
            int result=question(arr,n);
            if(result==-1)
            {
                System.out.println("hard");
            }
            else
            {
                System.out.println("easy");
            }
        }
    }
}