/**
 * Auto Generated Java Class.
 */
public class HelloWorld2 {
    /* ADD YOUR CODE HERE */
        /*��������û������Ϊstatic ѡŶͨ�����ʵ��������*/
    public static void main(String[] args)
    {
        String str = "HelloWorld";
        int a = 0;
        int b = a + 1;
        int result = 0;
        
        for(int i = 0;i<20;i++)
        {
            //ADD ��������
            
            //��ʵ���������ʵ����������������Ե���
            HelloWorld2 helloworld = new HelloWorld2();
            result = helloworld.ADD(a,b);
            System.out.println( str + " " + result);
            a = a +i;
        }
    }
    
    //�����÷�����û��ʹ��static����Ϊ��̬�����������ʵ��������
    //�����÷���,û��static���Σ����Ǿ�̬����������ʱ��Ҫͨ�����ʵ�������е���
    private int ADD(int x,int y)
    {
        return x + y;
    }
    
}
