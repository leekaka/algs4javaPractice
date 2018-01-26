/**
 * Auto Generated Java Class.
 */
public class Date {
    private final int month;
    private final int day;
    private final int year;
    
    public Date(int m,int d,int y)
    {
        month = m;day = d;year = y;
    }
    
    public int month()
    {
        return month;
    }
    
    public int day()
    {
        return day;
    }
    public int year()
    {
        return year;
    }
    
    public String toString()
    {
        return month() + "month/" + day() +"day/"+ year() +"year";
    }
    
    public boolean equals(Object x)
    {
        if(this == x) return true;
        if(x == null) return false;
        if(this.getClass() != x.getClass()) return false;
        if(this.day ! = x.day) return false;
        if(this.month != x.month) return false;
        if(this.year !=x.month) return false;
        
        return true;
    }
    
    /* ADD YOUR CODE HERE */
    
}
