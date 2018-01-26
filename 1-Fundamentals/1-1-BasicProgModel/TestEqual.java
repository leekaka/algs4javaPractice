/**
 * Auto Generated Java Class.
 */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class TestEqual {
    
    /* ADD YOUR CODE HERE */
    public static void main(String[] args)
    {
        double x ;
        double y;
        x = StdIn.readDouble();
        y = StdIn.readDouble();
        StdOut.print(compare(x)&&compare(y));
    }
    
    public static boolean compare(double x)
    {
        if(x>0&&x<1)
            return true;
        else
            return false;
    }
}
