/**
 * Auto Generated Java Class.
 */
public class HelloWorld {
    
    /* ADD YOUR CODE HERE */
    /*被调方法申明为static 可以在其他申明中直接调用*/
    public static void main(String[] args)
    {
        String str = "HelloWorld";
        int a = 0;
        int b = a + 1;
        int result = 0;
        
        for(int i = 0;i<20;i++)
        {
            //ADD 方法调用
            result = ADD(a,b);
            System.out.println( str + " " + result);
            a = a +i;
        }
    }
    
    //被调用方法，使用了static申明为静态方法
    private static int ADD(int x,int y)
    {
        return x + y;
    }
    
}
