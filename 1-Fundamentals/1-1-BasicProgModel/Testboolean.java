/**
 * Auto Generated Java Class.
 */

import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Testboolean {
//    public Testboolean(){}  //不知道这个有什么作用
    
    public static void main(String[] args)
    {
        boolean[][]a = new boolean[10][10];
        a = RandomInitial(a);
        TestPrint(a);
    }
    
    public static void TestPrint(boolean [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
             StdOut.print(" " + i);
             for(int j =0;j<10;j++)
             {
                 if(a[i][j])
                     StdOut.print("*");
                 else
                     StdOut.print("+");
                 
             }

        }
    }
    
    public static boolean [][] RandomInitial(boolean[][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j =0;j<a.length;j++)
            {
            if(StdRandom.bernoulli(0.1))
                a[i][j] =true;
            else
                a[i][j] = false;
            }
        }
        return a;
    }
    /* ADD YOUR CODE HERE */
    
}
