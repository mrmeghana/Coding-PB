//Few ways to declare a STRING
//Code contributed by Meghana M.R.
import java.io.*;
import java.lang.*;
import java.util.*;
public class strings_declare
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            //Method1: Using String method ,passing into it
            String str=new String("Meghana M.R.");
            //Method-2: Directly assigning to the variable
            String str1="Meghana";
            //Method-3: Asking from the user
            String str2;
            str2=sc.nextLine();
            //Printing all three
            System.out.println(str);
            System.out.println(str1);
            System.out.println(str2);
            

        }
}
