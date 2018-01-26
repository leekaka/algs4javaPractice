/**
 * Auto Generated Java Language Level Class.
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {
    public static void main(String[] args)
    {
        double Sum = 0.0;
        int cnt =0;
        while(!StdIn.isEmpty())                  
        {
            Sum += StdIn.readDouble();   //这个输入是 需要自己一个个输入的，或者采用 < txt 方式
            cnt++;
        }
        double avg = Sum/cnt;
        StdOut.printf("Average is % .5f \n",avg);   
    }
    
    /* ADD YOUR CODE HERE */  
}
