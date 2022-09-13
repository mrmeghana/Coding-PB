import java.io.*;
import java.lang.*;
import java.util.*;
public class CharacterCount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int len=s.length();
            int size=26;
            int freq[]=new int[size];
            for(int i=0;i<26;i++)
            freq[i]=0;
            for(int i=0;i<len;i++){
              freq[s.charAt(i)-'a']++;
            }
            int flag=0;
            for(int i=0;i<26;i++){
              if(freq[i]>1){
                System.out.printf("%c=%d ",(char)(i+'a'),freq[i]);
                flag=1;
              }
            }
            if(flag!=1)
            System.out.println(-1);
            else
            System.out.println();
          }
        }
      }