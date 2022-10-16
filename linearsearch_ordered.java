import java.io.*;
import java.util.*;
import java.lang.*;
public class linearsearch_ordered
{
    public static int linearsearch(int arr[],int data)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==data)
            {
                return i;
            }
            if(arr[i]>data)
            {
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        int data=sc.nextInt();
        int result=linearsearch(arr,data);
        if (result == -1)
        System.out.print("Element not found");
        else
        System.out.print("Element found at index: " + result);
    }
}