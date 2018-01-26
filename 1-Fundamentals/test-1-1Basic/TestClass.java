/**
 * Auto Generated Java Class.
 */

import edu.princeton.cs.algs4.StdOut;


public class TestClass {
     
    public static void main(String[] args)
    {
        double t = 0.0,m = 0.0;
        double h = 0;
        int H = Integer.parseInt(args[2]);
        double  T =  Double.parseDouble(args[0]); 
        double M = Double.parseDouble(args[1]);
        Mathtest test = new Mathtest();
        t = test.sqrt_(T);
        m = test.abs(M);
        h = test.H(H);
         StdOut.printf("求根:%f\n",t); 
         StdOut.printf("求绝对值:%f\n",m); 
         StdOut.printf("the sum /; %f\n",h);
    }
    /* ADD YOUR CODE HERE */ 
    
}
