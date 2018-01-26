/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
    
public class TransMartix {
    
    /* ADD YOUR CODE HERE */
    public static void main(String[] args)
    {
            int m =5;
            int n =5;
            int [][] a =new int [m][n];
            int [][] b =new int [m][n];
            
            a = RandomInitial(a,n);
            b = TranMatrix(a,b);
            MigratePrint(b);
    }

    


    public static int [][] MigratePrint(int [][]a)
    {
        StdOut.println("输出转置数组\r\n");
        //StdOut.println(a[0].length);
        
        for(int i =0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                StdOut.print(a[i][j]+" ");
            }
            StdOut.println();
        }
        
        return a;
        
    }
    public static int [][] TranMatrix(int [][] a,int [][]b)
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j =0;j<a[0].length;j++)
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
        
        
    }
    public static  int [][] RandomInitial(int [][] a,int N)
    {
        StdOut.print("初始化数组\r\n");
        for(int i=0;i<a.length;i++)
        {
            for(int j =0;j<a[0].length;j++)
            {
                a[i][j] = StdRandom.uniform(N);
                StdOut.print(a[i][j] + " ");
            }
                StdOut.println();
        }
        return a;        
    }

}