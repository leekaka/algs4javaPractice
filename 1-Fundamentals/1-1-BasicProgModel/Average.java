/**
 * Auto Generated Java Class.
 */
//import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.In;

public class Average {
    
    public static void main(String[] args)
    {
        double sum = 0.0;
        int cnt = 0;
        while(!StdIn.isEmpty())
        {
            sum += StdIn.readDouble();
            cnt++;
        }
        double vag = sum/cnt;
        StdOut.printf("Average is %.5f",vag);
    }
    
    /* ADD YOUR CODE HERE */
    
}
