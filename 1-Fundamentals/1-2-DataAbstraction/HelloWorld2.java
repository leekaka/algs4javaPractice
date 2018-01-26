/**
 * Auto Generated Java Class.
 */
public class HelloWorld2 {
    /* ADD YOUR CODE HERE */
        /*被调方法没有申明为static 选哦通过类的实例化调用*/
    public static void main(String[] args)
    {
        String str = "HelloWorld";
        int a = 0;
        int b = a + 1;
        int result = 0;
        
        for(int i = 0;i<20;i++)
        {
            //ADD 方法调用
            
            //先实例化，这个实例里有这个方法可以调用
            HelloWorld2 helloworld = new HelloWorld2();
            result = helloworld.ADD(a,b);
            System.out.println( str + " " + result);
            a = a +i;
        }
    }
    
    //被调用方法，没有使用static申明为静态方法（这个叫实例方法）
    //被调用方法,没被static修饰，不是静态方法。调用时需要通过类的实例化进行调用
    private int ADD(int x,int y)
    {
        return x + y;
    }
    
}
