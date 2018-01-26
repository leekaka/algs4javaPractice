/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestStackofString {
    public static void main(String[] args)
    {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack(100);
        
        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if(!item.equals("-")) s.push(item);
            else 
            {
                if(!s.isEmpty()) StdOut.print(s.pop() + " ");
            }
        }
        
        StdOut.println("("+ s.size() + "left in stack)");
        
    }
    
    /* ADD YOUR CODE HERE */
    
}
