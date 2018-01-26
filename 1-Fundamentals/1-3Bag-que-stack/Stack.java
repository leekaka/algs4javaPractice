/**
 * Auto Generated Java Class.
 */
import java.util.Iterator;
import edu.princeton.cs.algs4.StdOut; 
import edu.princeton.cs.algs4.StdIn; 
public class Stack<Item> implements Iterable<Item>
{
    private Node first;
    private int N;
    
    private class Node     //私有类 数据结构
    {
        Item item;
        Node next;
    }
    
    public boolean isEmpty(){ return N==0;}
    public int size(){ return N;}
    public Item pop()
    {
        Item temp = first.item;
        first = first.next;
        N--;
        return temp;
    }
    
    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    
    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext()
        {
            return current !=null;
        }
        public void remove(){ }
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
    public static void main(String[] args)
    {
        Stack<String> st = new Stack<String>();
        while(!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(!s.equals("-")) st.push(s);
            else if(!st.isEmpty()) StdOut.print(st.pop() + " ") ;      
        }
        if(!st.isEmpty())StdOut.println(st.size() + " left in stack");     
    }
    
    
    
    /* ADD YOUR CODE HERE */
    
}
