package IQ;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/8/27 16:10
 * @注释 测试换行和Unicode逃逸问题
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
如果存在unicode编码，编译器识别就会转换，无论它是在任何地方
\u000a：换行
\u000d：回车
\u007d：{
\u007b：}
* */
          if (false == true) {
              //只有 “/**/”用这个注释可以避免受到unicode编码的影响
              // \u000a\u007d\u007b
            System.out.println(123456);
//            System.out.println("\u8f66"); //转义字符可以直接打印，并显示中文
//            System.out.println("\\u8f66"); //除非在\前面用转义字符转义
          }
    }
}
