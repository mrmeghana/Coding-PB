import java.util.*;
  import java.io.*;

public class Main {

        public static void gift(int a,int b,int c )
          {
              if(a>=0 && b>=0 && c>=0)
              {
                  while(a<=b)
                  {
                      if(c==0 && a!=b)
                      {
                          break;
  
                      }
                      if(a==b)
                      {
                          return "YES";
                      }
                      else
                      {
                          a=a+c;
                      }
                  }
              }
              else if(((a > b)&&((a-b)%c == 0))||((b > a) && ((b-a)%c )== 0))
              {
                System.out.println("YES");
              }
              else
              {
                  if(a>=b)
                  {
                      while(a>=b)
                      {
                          if(c==0 && a!=b)
                          {
                              break;
  
                          }
                          if(a==b)
                          {
                              return "YES";
                          }
                          else
                          {
                              a=a+c;
                          }
                      }
  
                  }    
              }
  
             return "NO"; 
          }
      public static void main(String[] args)
      {
          
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          while(t--!=0)
          {
              int a,b,c;
              a=sc.nextInt();
              b=sc.nextInt();
              c=sc.nextInt();
              System.out.println(gift(a,b,c));
  
          }
      }
  
}
