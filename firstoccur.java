import java.io.*;
import java.lang.*;
import java.util.*;
public class firstoccur
{
        public static void main(String args[]) throws IOException {
          //write your code here
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while(t-->0){
            int n = sc.nextInt();
            String wins = sc.next();
            char aditya = 'A';
            char danish = 'D';
            int countA = 0;
            int countB = 0;
            for(int i = 0; i < n; i++){
              if(wins.charAt(i) == 'A' ){
                countA++;
              }
            }
            for(int i = 0; i < n; i++){
              if(wins.charAt(i) == 'D' ){
                countB++;
              }
            }
            if(countA < countB){
              System.out.println("Danish");
            }
            if(countA > countB){
              System.out.println("Aditya");
            }
            else{
              System.out.println("AdiDan");
            }
          }
        }
      
}