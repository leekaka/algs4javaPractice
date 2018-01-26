/**
 * Auto Generated Java Class.
 */
import java.util.Iterator;

public class ResizingzarrayStack<Item> implements Iterable<Item>
{
    private Item[]a =(Item[])new Object[1];
    private int N;
    public boolean isEmpty() {return N == 0;}
    public int size(){return N;}
    public void resize(int max)
    {
        Item[] temp = (Item[])new Object[max];
        for(int i=0;i<N;i++)
        {
            temp[i] = a[i];
        }
        a = temp;
    }
    public void push(Item val)
    {
        if(N == a.length) resize(2*a.length);
        a[N++] = val;
    }
    public Item pop()
    {
        Item temp = a[--N];
        a[N] = null;
        if(N>0 && N<a.length/4) resize(a.length/2);
        return temp;
    }
    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }
    
    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i =N;
        public boolean hasNext() {return i>0;}
        public Item next(){return a[--i];}
        public void remove(){ }
    }
    
    
    
    
    
    /* ADD YOUR CODE HERE */
    
}
