/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Es1_1_11 {
    
    /* ADD YOUR CODE HERE */
 public Es1_1_11(){}
 
 public static void main(String[] args)
 {
  boolean[][]a = new  boolean[10][10];
  a = RandomInitial(a);
  TestPrint(a);
 }
    
 public static void TestPrint(boolean[][]a)
 {
   StdOut.print("  ");
  for(int i = 0;i<a.length;i++)
   StdOut.print(" "+ i+ " ");
   StdOut.print("\n");
  /*       以上是用来打印列的   */
  
   for(int i = 0;i<10;i++)
   {
    StdOut.print(i+" ");
    for(int j = 0;j<10;j++)
    {
     if(a[i][j])
      StdOut.print(" "+"*"+" ");
     else
      StdOut.print(" "+"+"+" ");
    }
    StdOut.println(" ");
   }
  
 }
 
 public static boolean[][] RandomInitial(boolean[][] a)
 {
  for(int i =0;i<a.length;i++)
  {
   for(int j = 0;j<a.length;j++)
   {
    if(StdRandom.bernoulli(0.5))
     a[i][j] = true;
    else a[i][j] = false;
   }
   
  }
  return a;
 }
}
