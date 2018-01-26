/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.In;

public class Es1_1_27 {
    public static double binomial(int N,int k,double p,Counter c)
    {
        c.increment();
        if(N == 0 && k == 0) return 1.0;
        if(N<0||k<0) return 0.0;
        
        return (1.0-p)*binomial(N-1,k,p,c)+p*binomial(N-1,k-1,p,c);
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        Counter c = new Counter("Calls");
        StdOut.println(binomial(N,k,p,c));
        StdOut.println(c);
        
    }
    
    /* ADD YOUR CODE HERE */
    
}
