/**
 * Auto Generated Java Class.
 */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;

public class Whitelist {
    public static void main(String[] args)
    {
        int [] w = In.readInts(args[0]);   //输入一个数组

        StaticSETofInts set = new StaticSETofInts(w);  //设置为白名单
        while(!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if(!set.contains(key))
                StdOut.println(key);
        }
        
        
        
    }
    /* ADD YOUR CODE HERE */
    
}
