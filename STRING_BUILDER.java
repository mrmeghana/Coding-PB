//declaring an array using string builder
//code contributed by M.R.Meghana
import java.io.*;
import java.lang.*;
import java.util.*;
public class STRING_BUILDER
{
    public static void main(String[] args)
    {
        StringBuilder str1=new StringBuilder("M.R.Meghana");//first we should declare it and add string into it
        String str=new String(str1);//we can then pass the string to another string
        System.out.println(str1);
        System.out.println(str);
    }
}
