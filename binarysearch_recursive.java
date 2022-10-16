import java.io.*;
import java.util.*;
import java.lang.*;
public class binarysearch_recursive
{
    public static int binarysearch(int arr[],int data,int low, int high)
    {
        int mid=(low+(high-low))/2;
        if(low>high)
        {
            return -1;
        }
        if(arr[mid]==data)
        {
            return mid;
        }
        else if(arr[mid]>data)
        {
            return binarysearch(arr,data,low,mid-1);
        }
        else
        {
            return binarysearch(arr,data,mid+1,high);
        }
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
        System.out.println("Enter the element to be searched: ");
        int data=sc.nextInt();
        int element=binarysearch(arr,data,0,n-1);
        if(element==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The element is found at index: "+element);
        }
    }
}