/**
 * Auto Generated Java Class.
 */
public class HelloWorld3 {
    
    /* ADD YOUR CODE HERE */
    //调用外部的类的方法，通过类的实例化进行调用。示例代码如下：
 public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str="HelloWord!";
    int a=5;
    int b=a+1;
    int result1=0,result2=0;
     
    for(int i=0;i<20;i++)
    {
      //Add方法调用
      //类的实例化
      Test test=new Test();
       
      //通过实例化的类进行Add方法调用
      result1 = test.Add(a, b);     
      result2 = test.Sub(a, 10);   
       
      System.out.println(str+" "+ result1);
      System.out.println(str+" Sub is : "+ result2); 
      a+=i;
       
    }
  }
}

