import java.io.*;
import java.util.*;
import java.lang.*;
public class Noble_Vowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char arr[]=str.toCharArray();
        int flag=0;
        int i;
        int n=arr.length;
        for( i=0;i<n-1;i++)
        {
            if(arr[i]!='a' && arr[i]!='e' && arr[i] !='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='n')
            {
                if(arr[i+1]!='a' || arr[i+1]!='e' || arr[i+1]!='i' || arr[i+1]!='o' || arr[i+1]!='u' || arr[i]!='n')
                {
                    flag=1;
                    break;
                }
            }
        }
        if(i==str.length()-1 && (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='n' ))
        {
            flag=0;
        }
        else
        {
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("YES");
        }
        else if(flag==1)
        {
            System.out.println("NO");
        }
    }
}