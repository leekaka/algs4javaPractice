/**
 * Auto Generated Java Class.
 */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;

public class Whitelist {
    public static void main(String[] args)
    {
        int [] w = In.readInts(args[0]);   //����һ������

        StaticSETofInts set = new StaticSETofInts(w);  //����Ϊ������
        while(!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if(!set.contains(key))
                StdOut.println(key);
        }
        
        
        
    }
    /* ADD YOUR CODE HERE */
    
}
