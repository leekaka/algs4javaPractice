/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Es1_1_15 {
    
    public Es1_1_15() { 
        /* YOUR CONSTRUCTOR CODE HERE*/
    }
    /* ADD YOUR CODE HERE */
    public static int[] histogram(int[]a,int M)  //返回一个数组，数组的第i个元素的值  是整数 i 出现在a[]的次数
    {
        int[] h = new int[M];
        for(int i =0;i<a.length;i++)
        {
            if(a[i]<M)
                h[a[i]]++;
        }
        return h;
    }
    
    public static void Show(int[]a)
    {
        for(int i =0;i<a.length;i++)
        {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
        
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        int[] a =new int[N];
        int[] b = new int[M];
        for(int i =0;i<a.length;i++)
            a[i] = StdRandom.uniform(M);
        Show(a);
        b = histogram(a,M);
        Show(b);
        
    }
    
}
