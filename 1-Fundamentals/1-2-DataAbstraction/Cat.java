/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

//import edu.princeton.cs.algs4.In;


public class Cat {
    
    /* ADD YOUR CODE HERE */
    public static void main(String[] args)
    {
        Out out = new Out(args[args.length-1]);
        
        StdOut.printf("the changdu is %d:",(args.length-1));
        
        for(int i = 0;i<args.length-1;i++)
        {
            In in = new In(args[i]);
            String s =in.readAll();
            out.println(s);
            in.close();
        }
        out.close();        //不是很清楚输入输出流的使用方法
    }
}
