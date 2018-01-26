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
    int [] whitelist = In.readInts(args[0]);   //�������뷽ʽ  In.readInts  ֱ�Ӿ��ǲ��� ����ͺ�  
    Arrays.sort(whitelist);                     
    
    while(!StdIn.isEmpty())                    //  StdIn.Int    //��Ҫ��<����
    {
        int key = StdIn.readInt();
        if(rank(key,whitelist) == -1)  //��û��  ��᷵��-1
            StdOut.println(key);       
    }
}
    /* ADD YOUR CODE HERE */   
}
