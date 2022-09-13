import java.io.*;
import java.util.*;
import java.lang.*;
public class V_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int space=8;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            space=space-2;
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}