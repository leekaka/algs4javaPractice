/**
 * Auto Generated Java Language Level Class.
 */
import edu.princeton.cs.algs4.StdOut;
public class Sort {
    
    public static void Insertionsort(Comparable[]a)
    {
        int N  = a.length;
        for(int i = 1; i<a.length;i++)
        {
            for(int j = i;j>0 && less(a[j],a[j-1]);j--)
            {
                exch(a,j,j-1);                
            }
        }
    } 
    
    public static void Selctionsort(Comparable[] a)
    {
        int N = a.length;
        for(int i = 0;i<a.length;i++ )
        {
            int min = i;
            for(int j = i+1;j<a.length;j++)
            {
                if(less(a[j],a[min])) min = j;
                exch(a,i,min);
            }
        }       
    }
    
    /* ADD YOUR CODE HERE */
    
      private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }
    
    private static void exch(Comparable[] a,int i, int j)
    {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
    
    private static void show(Comparable[] a)
    {
        for(int i = 0;i <a.length;i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
    
    public static boolean isSorted(Comparable[] a)
    {
        for(int i = 1;i<a.length;i++)
        {
            if(less(a[i],a[i+1])) return false;
            
        }
        return true;
    }
    
}
