/**
 * Auto Generated Java Class.
 */
public class TestMax {
    
    /* ADD YOUR CODE HERE */
    public static void main(String[] args)
    {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        
//        int i = 5;
//        int j = 2;
        int k = max(i,j);
        System.out.println("The maximum between " + i + " and " + j + " is " + k);
    }
    
    public static int max(int a, int b)
    {
        if(a >b)
            return a;
        else
            return b;           
    }
    
}
