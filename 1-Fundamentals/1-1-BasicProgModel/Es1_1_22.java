/**
 * Auto Generated Java Class.
 */
import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class Es1_1_22 {
    public static int rank(int key,int[]a)
    {
        return rank(key,a,0,a.length-1,0);
    }
     public static int rank(int key, int[]a,int lo,int hi,int N) 
     { 
         StdOut.printf("%d,%d,%d", N, lo, hi);
         if(lo >hi) return -1;
         int mid = lo + (hi-lo)/2;
         if (key < a[mid]) return rank(key,a,lo,mid-1,N+1);
         else if (key > a[mid]) return rank(key,a,mid+1,hi,N+1);
         else  return mid;
     }
     
//     private static String repeat(int n, char c)
//    {
//        String s = "";
//        for (int i = 0; i < n; i++)
//            s += c;
//        return s;
//    }
    public static void main(String[] args) 
    {
      // read the integers from a file
        
//        In in = new In(args[0]);
        int[] whitelist = In.readInts(args[0]);

        // sort the array
        Arrays.sort(whitelist);

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key,whitelist) == -1)
                StdOut.println(key);
        }
    }     
    /* ADD YOUR CODE HERE */
    
}
