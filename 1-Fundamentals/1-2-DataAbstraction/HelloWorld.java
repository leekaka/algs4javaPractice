/**
 * Auto Generated Java Class.
 */
public class HelloWorld {
    
    /* ADD YOUR CODE HERE */
    /*������������Ϊstatic ����������������ֱ�ӵ���*/
    public static void main(String[] args)
    {
        String str = "HelloWorld";
        int a = 0;
        int b = a + 1;
        int result = 0;
        
        for(int i = 0;i<20;i++)
        {
            //ADD ��������
            result = ADD(a,b);
            System.out.println( str + " " + result);
            a = a +i;
        }
    }
    
    //�����÷�����ʹ����static����Ϊ��̬����
    private static int ADD(int x,int y)
    {
        return x + y;
    }
    
}
