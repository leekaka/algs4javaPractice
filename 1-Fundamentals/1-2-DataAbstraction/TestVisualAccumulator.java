/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;


public class TestVisualAccumulator {
    
    /* ADD YOUR CODE HERE */
     public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a =new VisualAccumulator(T,10.0);
        
        for(int t=0;t<T;t++)
        {
            a.addDataValue(StdRandom.uniform(1,10));
        }
        StdOut.println(a);
    }  
}
