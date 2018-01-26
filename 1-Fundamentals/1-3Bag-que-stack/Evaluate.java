/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class Evaluate {
    public static void main(String[] args)
    {
        Stack<Double>vals = new Stack<Double>();
        Stack<String>op = new Stack<String>();
        
        while(!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(s.equals("(")) ;
            else if(s.equals("+")) op.push(s);
            else if(s.equals("-")) op.push(s);
            else if(s.equals("*")) op.push(s);
            else if(s.equals("/")) op.push(s);
            else if(s.equals("sqrt")) op.push(s);
            else if(s.equals(")"))
            {
                Double v = vals.pop();
                String o = op.pop();
                if(o.equals("+")) v = vals.pop() + v;
                else if(o.equals("*")) v = vals.pop() * v;
                else if(o.equals("-")) v = vals.pop() - v;
                else if(o.equals("/")) v = vals.pop()/v;
                else if(o.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else
            {
                vals.push(Double.parseDouble(s));
            }
            StdOut.println(vals.pop());
            
        }
        
        
        
        
    }
    /* ADD YOUR CODE HERE */
    
}
