import java.io.*;
import java.lang.*;
import java.util.*;
public class gcdRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0)
        {
            int N=sc.nextInt();
            int P=sc.nextInt();
            System.out.println(gcd(N,P));
        }
    }
    static int gcd(int N,int P)
    {
        if(P!=0)
        {
            return gcd(P ,N%P);
        }
        else 
        {
            return N;
        }
    }
}
