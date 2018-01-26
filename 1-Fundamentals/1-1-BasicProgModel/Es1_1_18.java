/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
public class Es1_1_18 {
    public static int mystery(int a,int b)
    {
        StdOut.printf("%7d, %3d\n", a, b);
        if( b ==0) return 0;
        if(b%2==0)return mystery(a+a,b/2);
        return mystery(a+a,b/2)+a;
    }
    
    public static int mystery1(int a, int b)
    {
        StdOut.printf("%3d, %3d\n", a, b);
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery1(a+a, b/2);
        return mystery1(a+a, b/2) + a;
    }
    
    public static int mystery2(int a, int b)
    {
        StdOut.printf("%7d, %3d\n", a, b);
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }
    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        StdOut.print(mystery(T,M));
    }
    
    
}

