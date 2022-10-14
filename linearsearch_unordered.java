import java.io.*;
import java.lang.*;
import java.util.*;
public class linearsearch_unordered
{
    public static int Linearsearch(int arr[],int data)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==data)
            {
                return i;
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
        System.out.println("Enter the element to search");
        int data=sc.nextInt();
        int result=Linearsearch(arr,data);
        if (result == -1)
        System.out.print("Element not found");
        else
        System.out.print("Element found at index: " + result);
    }
   
}