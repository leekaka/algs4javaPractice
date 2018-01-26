/**
 * Auto Generated Java Language Level Class.
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ShuruData {
    
    public ShuruData(Comparable[] a){};
    
    private static void show(Comparable[] a)
    {
        for(int i = 0;i <a.length;i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

   public static void main(String[] args)
    {
        Sort sort = new Sort();
        String[] a = In.readStrings();
        sort.Insertionsort(a);
        assert sort.isSorted(a);
        show(a);
            
    }
    
    /* ADD YOUR CODE HERE */
    
}
