/**
 * Auto Generated Java Class.
 */
public class HelloWorld3 {
    
    /* ADD YOUR CODE HERE */
    //�����ⲿ����ķ�����ͨ�����ʵ�������е��á�ʾ���������£�
 public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str="HelloWord!";
    int a=5;
    int b=a+1;
    int result1=0,result2=0;
     
    for(int i=0;i<20;i++)
    {
      //Add��������
      //���ʵ����
      Test test=new Test();
       
      //ͨ��ʵ�����������Add��������
      result1 = test.Add(a, b);     
      result2 = test.Sub(a, 10);   
       
      System.out.println(str+" "+ result1);
      System.out.println(str+" Sub is : "+ result2); 
      a+=i;
       
    }
  }
}

