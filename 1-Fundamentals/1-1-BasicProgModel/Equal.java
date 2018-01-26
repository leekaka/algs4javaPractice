/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class Equal {
    
    /* ADD YOUR CODE HERE */
    public static int Findequl(int a,int b, int c)
    {
        if(a == b && b == c)
        {
            return 1;
        }
        else 
        {
            return 0;
        }        
    }
    
    public static void main(String[] args)
    {
        int a,b,c;
        a =b =c =0;
        StdOut.println("Please enter three numbers");
        
        a = StdIn.readInt();
        b = StdIn.readInt();
        c = StdIn.readInt();
//          a = Integer.parseInt(args[0]);
//          b = Integer.parseInt(args[1]);
//          c = Integer.parseInt(args[2]);
        
        
        if(Findequl(a,b,c) == 1)
        {
            StdOut.print("equal");
        }
        else
        {
            StdOut.print("not equal");
        }
    
    }
    
}
