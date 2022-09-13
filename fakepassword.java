import java.util.*;
  import java.io.*;
  
  public class fakepassword {
   public static void main(String[] args)throws IOException {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String original=sc.next();
            String fake=sc.next();
            password(original, fake);
        }
    }

    private static void password(String original, String fake) {
        int start = 0;
        int last = fake.length() - 2;
        int length = fake.length();
        int front = length - last;
        String first = fake.substring(start, front);
        String firstHalf = fake.substring(front, length);
        String second = fake.substring(last, length);
        String secondHalf = fake.substring(start, last);
        String temp1 = second.concat(secondHalf);
        String temp2 = firstHalf.concat(first);
       // System.out.println(temp1);
        //System.out.println(temp2);
        if (temp1.compareTo(original) == 0 || temp2.compareTo(original) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}