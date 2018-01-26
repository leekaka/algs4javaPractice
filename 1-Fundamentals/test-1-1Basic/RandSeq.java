/**
 * Auto Generated Java Language Level Class.
 */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandSeq {
    public static void main(String[]args)
    {
       int N = Integer.parseInt(args[0]);
       double lo = Double.parseDouble(args[1]);
       double hi = Double.parseDouble(args[2]);
       for(int i = 0;i<N;i++)
       {
           double x = StdRandom.uniform(lo,hi);
           StdOut.printf("The result is : %s \n\r",x);
       }
    }
    /* ADD YOUR CODE HERE */
    
}
