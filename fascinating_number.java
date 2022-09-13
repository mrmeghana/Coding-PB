import java.io.*;
import java.lang.*;
import java.util.*;
public class fascinating_number
{
    public static int isfascinating(int x)
    {
        int d1=0,d2=0,d3=0,d4=0;
        d1=x%10;
        x=x/10;
        d2=x%10;
        x=x/10;
        d3=x%10;
        x=x/10;
        d4=x%10;
        x=x/10;
        if(d1==d2|| d1==d3 || d1==d4 || d2==d3 || d2==d3)
        {
            return 0;
        }
        else    
            return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            while(n>0)
            {
                for(int i=n+1;i<9999;i++)
                {
                    int p=isfascinating(i);
                    if(p==1)
                    {
                        break;
                    }
                    System.out.println(i);
                }
            }
        }
    }
}