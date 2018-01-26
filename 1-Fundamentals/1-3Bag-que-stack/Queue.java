/**
 * Auto Generated Java Class.
 */
import java.util.Iterator;
import edu.princeton.cs.algs4.StdIn; 
import edu.princeton.cs.algs4.StdOut;

public class Queue<Item> implements Iterable<Item>
{
    private Node first;
    private Node last;
    private int N;
    
    private class Node
    {
        Item item;
        Node next;
    }
    public boolean isEmpty(){return first == null;}
    public int size() {return N;}
    public Item dequeue()
    {
        Item temp = first.item;
        first = first.next;
        if(isEmpty())  last = null;
        N--;
        return temp;
    }
    public void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else         oldlast.next = last;
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
    
    
    /* ADD YOUR CODE HERE */
    
    public static void main(String[] args)
    {
        Queue<String> st = new Queue<String>();
        while(!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(!s.equals("-")) st.enqueue(s);
            else if(!st.isEmpty()) StdOut.print(st.dequeue() + " ") ;      
        }
        if(!st.isEmpty())StdOut.println("(" + st.size() + " left in Queue                                                              )");     
    }
    
}
