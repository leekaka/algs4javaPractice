/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class FixedCapacityStack<Item> {
    
    private Item[] a;
    private int N;
    
    public FixedCapacityStack(int cap)
    {
       a = (Item[]) new Object[cap];
    }
    public void push(Item item)
    {
        if(N == a.length) resize(2*a.length);
        a[N++] = item;   
    }
    public Item pop()
    {
        Item item = a[--N];
        a[N] = null;   //±ÜÃâÓÎÀë
        if(N>0 && N == a.length/4) resize(a.length/2);
        return item;
    }
    public boolean isEmpty()
    {
        return N==0;
    } 
    int size()
    {
        return N;
    }   
    
    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0;i<N;i++)
        {
            temp[i] = a[i];
        }
        a = temp;
    }
   
    /* ADD YOUR CODE HERE */
    
    public static void main(String[] args)
    {
        FixedCapacityStack<String> st;
        st = new FixedCapacityStack<String>(100);
        while(!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(!s.equals("-")) st.push(s);
            else if(!st.isEmpty()) StdOut.println(st.pop() + " ");
        }
        if(!st.isEmpty()) StdOut.println("("+ st.size() +"left in stack)");
    }
          
    /* ADD YOUR CODE HERE */
    
}
