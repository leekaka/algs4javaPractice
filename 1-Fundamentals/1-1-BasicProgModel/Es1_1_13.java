/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Es1_1_13 {
    
    /* ADD YOUR CODE HERE */
    public Es1_1_13(){}    //���캯��
    
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);   //����
        int [][] a = new int [m][n];
        int [][] b = new int [n][m];     //��ʼ��
        
        a = RandomInitail(a,n);     //��ʼ��
        b = MigrateArrays(a,b);    //ת�ú���
        Es1_1_13 test = new Es1_1_13();      
        test.MigratePrint(b);                   //�Ǿ�̬��������ʵ����������Ҫʵ����֮������ã�˽�е���ɶ���������أ�
    }
    
    private void MigratePrint(int[][] a)
    {
        StdOut.println("Output Migrated Matrix");
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                StdOut.print(a[i][j]+ " ");
            }
             StdOut.println();
        }
    }
    
    private static int[][] MigrateArrays(int[][]a,int[][]b)
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                b[j][i] = a[i][j];
            }          
        }
        return b;
    }
    
    private static int[][] RandomInitail(int[][]a,int n)
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                a[i][j] = StdRandom.uniform(n);
                StdOut.print(a[i][j]+ " ");
            }  
            StdOut.println();               //��ӡһ�����з�
        }
        return a;      
    }
    
    
}
