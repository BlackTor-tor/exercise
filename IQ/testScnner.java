package IQ;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/8/27 16:10
 * @ע�� ���Ի��к�Unicode��������
 */
public class testScnner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        System.out.println(s);
//        System.out.println("Hello World");
//        System.out.println( 1+ "\r" + 2);
//        System.out.println("--------------------");
//        System.out.println( 1 + "\r\n" + 2 + "\r\n");
//        System.out.println("--------------------");
//        System.out.println("\r\n" + 1 + "\r\n" + 2 + "\r\n");
//        System.out.println("--------------------");
//        System.out.println( 1 + "\r" + 2 + "\r");
//        System.out.println("--------------------");
//        System.out.print( "\r" + 1+ "\r" +  2 + "\r");

/*
�������unicode���룬������ʶ��ͻ�ת���������������κεط�
\u000a������
\u000d���س�
\u007d��{
\u007b��}
* */
          if (false == true) {
              //ֻ�� ��/**/�������ע�Ϳ��Ա����ܵ�unicode�����Ӱ��
              // \u000a\u007d\u007b
            System.out.println(123456);
//            System.out.println("\u8f66"); //ת���ַ�����ֱ�Ӵ�ӡ������ʾ����
//            System.out.println("\\u8f66"); //������\ǰ����ת���ַ�ת��
          }
    }
}
