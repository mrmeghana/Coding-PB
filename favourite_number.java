import java.io.*;
import java.util.*;
import java.lang.*;
public class favourite_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
          long n=sc.nextLong();
          int fav=5;
          long temp=n;
          int count=0;
          while(temp>0)
          {
              temp=n%10;
              if(temp==fav)
              {
                  count++;
              }
              n=n/10;
          }
          System.out.println(count);
        }
      }
  }