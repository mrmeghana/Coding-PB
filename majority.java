/*iven an array of size N, which contains the voting ID's of students that have stood up for the elections for class monitor, the candidate with votes greater than half the strength of the class will become monitor, find the ID of candidate that can become monitor else return -1 if no one can become.*/
import java.io.*;
import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
        int arr[]=new int[n];
        int winner=-1;
        int hash[]=new int[1000000];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            hash[arr[i]]++;
            if(hash[arr[i]]>n/2)
            {
                winner=arr[i];
            }
        }
        System.out.println(winner);
        t--;
        }
    }
}
