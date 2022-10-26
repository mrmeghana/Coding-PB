import java.util.*;
  import java.io.*;
  
  public class Smallest_number
   {
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(smallest(size, arr, k));
    }

    //Optimal Approach
    private static int smallest(int size, int[] arr, int min) {
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for(int i = 0; i < size; i++){
            if(set.contains(arr[i])){
                count++;
            }if(count == min){
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }
  }