/**
 * Auto Generated Java Class.
 */
import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class BinarySearch {
    public static int rank(int key,int[]a)
    {
        int lo = 0;
        int hi = a.length -1;
        while(lo <= hi)
        {
            int mid = lo + (hi -lo) / 2;
            if(key < a[mid]) hi = mid - 1;
            else if(key > a[mid]) lo = mid + 1;
            else return mid;
        }
      return -1;
    }

public static void main(String[]args)
{
    int [] whitelist = In.readInts(args[0]);   //两种输入方式  In.readInts  直接就是参数 输入就好  
    Arrays.sort(whitelist);                     
    
    while(!StdIn.isEmpty())                    //  StdIn.Int    //需要用<符号
    {
        int key = StdIn.readInt();
        if(rank(key,whitelist) == -1)  //若没有  则会返回-1
            StdOut.println(key);       
    }
}
    /* ADD YOUR CODE HERE */   
}
