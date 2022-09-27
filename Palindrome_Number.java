import java.io.*;
import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
        int n=sc.nextInt();
        ispalin(n);
        }
    }
    static void ispalin(int n)
    {
            int temp=reverse(n);
            if(temp==n)
            {
               System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    }
    static int reverse(int n)
    {
        int temp=0;
        while(n>0)
        {
            temp=(temp*10)+(n%10);
            n=n/10;
        }
        return temp;
    }
}
