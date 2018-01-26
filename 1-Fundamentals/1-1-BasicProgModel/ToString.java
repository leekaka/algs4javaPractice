/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
public class ToString {
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        String s = "";
        while(N>0)
        {
            s = (N % 2) + s;
            N /=2;
        }
        StdOut.println(s);
        
    }
    /* ADD YOUR CODE HERE */
    
}
