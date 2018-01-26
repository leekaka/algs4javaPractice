/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackofStrings {
    
    private String[] a;
    private int N;
    public FixedCapacityStackofStrings(int cap)
    {
       a = new String[cap];
    }
    public void push(String item)
    {
        a[N++] = item;   
    }
    public String pop()
    {
        return a[--N];   
    }
    public boolean isEmpty()
    {
        return N==0;
    } 
    int size()
    {
        return N;
    }    
    /* ADD YOUR CODE HERE */
    
    public static void main(String[] args)
    {
        FixedCapacityStackofStrings st;
        st = new FixedCapacityStackofStrings(100);
        while(!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(!s.equals("-")) st.push(s);
            else if(!st.isEmpty()) st.pop();
        }
        if(!st.isEmpty()) StdOut.println("("+ st.size() +"left in stack)");
    }
        
    
}
