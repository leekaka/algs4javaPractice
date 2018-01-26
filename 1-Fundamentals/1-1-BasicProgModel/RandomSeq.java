/**
 * Auto Generated Java Class.
 */
//import java.util.Arrays;
//import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.In;

import edu.princeton.cs.algs4.StdRandom;
    
public class RandomSeq {
    
    /* ADD YOUR CODE HERE */
    public static void main(String[] args)  //输入一个字符串，变成一个数组作为参数传入(这个输入需要参数传入)
    {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        
        for(int i = 0;i<N;i++)
        {
            double x = StdRandom.uniform(lo,hi);
            StdOut.printf("%.2f\r\n",x);
        }
    }
    
    
}
