import java.util.*;
  import java.io.*;
  
  public class Interesting_Array {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T--!=0)
		{
		  int N=sc.nextInt();
		  int arr[]=new int[N];
		  for(int i=0;i<N;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  int K=sc.nextInt();
		  int flag=0;
		  int left=0;
		    int right=N-1;
		  for(int i=left;i<right;)
		  
		  {
		    
		    if(arr[left]+arr[right]==K)
		    {
		      flag++;
		       System.out.println(left+" "+right) ;
		      break;
		      
		     
		    }
		    else if(arr[left]+arr[right]>K)
		    {
		      right--;
		    }
		    else
		    {
		      left++;
		      
		    }
		    
		  }
		  if(flag==0)
		  {
		      System.out.println("no answer") ;
		  }
		}
    }
  }