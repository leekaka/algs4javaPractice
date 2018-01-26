/**
 * Auto Generated Java Class.
 */

//import java.util.Arrays;
//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;


public class Drawpictures {
    public static void main(String[] args)
    {
        int N =100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.01);
        //StdDraw.setPenColor(BLACK);
        for(int i =1;i<=N;i++)
        {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));        }
    }
    
    /* ADD YOUR CODE HERE */
    
}
