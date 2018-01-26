/**
 * Auto Generated Java Class.
 */

public class Mathtest {
    
    public double sqrt_(double c)    
    {
        if(c < 0)
            return Double.NaN;
        double err = 1e-15;
        double t =c;
        while(Math.abs(t - c/t) > err *t)
        {
            t = (c/t + t)/2.0;
        }
        return  t;
    }
    
    public double abs(double x)
    {
        if(x<0) return -x;
        else return x;
    }
    
    public double H(int N)
    {
        double sum =0;
        for(int i = 1;i<=N;i++)
        {
            sum +=1.0/i;
        }
        return sum;
    }
    
    
   
    
    /* ADD YOUR CODE HERE */
    
}
