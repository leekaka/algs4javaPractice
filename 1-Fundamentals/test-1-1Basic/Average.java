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
            Sum += StdIn.readDouble();   //��������� ��Ҫ�Լ�һ��������ģ����߲��� < txt ��ʽ
            cnt++;
        }
        double avg = Sum/cnt;
        StdOut.printf("Average is % .5f \n",avg);   
    }
    
    /* ADD YOUR CODE HERE */  
}
