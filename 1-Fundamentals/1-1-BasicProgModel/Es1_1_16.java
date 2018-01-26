/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdRandom;

public class Es1_1_16 {
    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        StdOut.print(exR1(T));
        
    }
    public static String exR1(int n)
    {
        if(n<=0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
       
    }
    

    
    /* ADD YOUR CODE HERE */
    
}
