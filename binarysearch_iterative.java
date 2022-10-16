import java.io.*;
import java.util.*;
import java.lang.*;
public class binarysearch_iterative
{
    public static int binarysearch(int arr[],int data)
    {
        int n=arr.length;
        int high=n-1;
         int low=0;
         while(low<=high)
         {
         int mid=(low+(high-low))/2;
         if(arr[mid]==data)
         {
             return mid;
         }
         else if(data<arr[mid])
         {
             high=mid-1;
         }
         else
         {
             low=mid+1;
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
         System.out.println("Enter the Number to search");
         int data=sc.nextInt();
        
         int result=binarysearch(arr,data);
         if(result==-1)
         {
             System.out.println("Element not found.");
         }
         else
            System.out.println("The Element is found at Index: "+result);

    }
}
