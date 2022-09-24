import java.io.*;
import java.lang.*;
import java.util.*;
public class gcdRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println(gcd(num1,num2));
    }
    static int gcd(int num1,int num2)
    {
        if(num2!=0)
        {
            return gcd(num2,num1%num2);
        }
        else{
            return num1;
        }
    }
}
