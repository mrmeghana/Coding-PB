import java.util.*;
import java.io.*;

public class Main {

   /* function for finding all such combinations */
  static void permutation(int ones, int zeroes, String append, ArrayList<String> perm)
  {
     if(ones == 0){
         for(int i=0;i<zeroes;i++){
             append += "0";
         }
         perm.add(append);
         return;
     }
     else if(zeroes == 0){
         for(int j=0;j<ones;j++){
             append += "1";
         }
         perm.add(append);
         return;
     }

     permutation (ones - 1, zeroes, append + "1",perm);
     permutation (ones , zeroes - 1, append + "0",perm);
  }

  public static void main(String args[]) throws IOException {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t != 0){
    int n = sc.nextInt();
    int ones = 0, zeros = 0;

    while(n>0)
    {
      //Finding the number of zeroes and ones 
       if(n%2 == 0)
          zeros++;
       else
          ones++;
      n /= 2;    
    }
    String append = "";
    ArrayList<String> perm = new ArrayList<String>(); 


    permutation(ones, zeros, append, perm);  
    //To Sort all the permutations
    Collections.sort(perm);

    for(int i=0;i<perm.size();i++)
      System.out.print(perm.get(i) + " ");
    System.out.println();

    t--;
    }
  }
}
