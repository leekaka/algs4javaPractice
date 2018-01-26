//import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Es1_1_7
{
 public static void main(String[] args)
 {
  double T = Double.parseDouble(args[0]);
  StdOut.printf("T = %.5f\n",T);
  double rev = T;
  while(Math.abs(rev - T/rev) > 0.00001)
  {
   rev = (T/rev + rev)/2.0;
 
  }
    StdOut.printf("Genghao T is %.5f",rev);
  
 }
}