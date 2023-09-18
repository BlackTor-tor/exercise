package JavaBasics_High;

import java.util.Scanner;

@SuppressWarnings("all")
public class ExceptionExercise {
    public static int i = 1;

    public static int testException() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;//算数异常
            String name = null;
            if (name.equals("tor")) {//空指针异常
            } else {
                return i + 1;
            }
        } catch (ArithmeticException AE) {
            System.out.println("算数异常：" + AE.getMessage());
            return i + 2;//先执行i+2这个操作，但是暂时不返回，等finally语句执行完再return退出
        } catch (NullPointerException NE) {
            System.out.println("空指针异常：" + NE.getMessage());
            return i + 3;
        } catch (Exception E) {
            System.out.println("其它异常：" + E.getMessage());
            return i + 4;
        } finally {
            System.out.println("执行了finally代码");
            return i + 5;
            //1、如果finally里有return，则try-catch外不能有代码存在，表示方法已经结束。
            //2、如果finally里面有return，则不会执行捕获异常catch块中的return，优先执行finally中的
            /**
             3、如果finally没有return，在catch中return，finally里面存在变量修改的操作可以正常执行，但是在出现异常的对应catch中
             不会改变被finally操作过的变量的值。
              eg：
                     int i = 2;
                     try {
                     int a = 10;
                     int b = 0;
                     int result = a / b;//算数异常
                    } catch (ArithmeticException AE) {
                     System.out.println("算数异常：" + AE.getMessage());
                     return i + 2;//i = 4 > temp = 4，i在这里被计算了一下，然后赋值给临时变量保存，然后继续执行finally块中的代码
             执行完毕后把temp变量中的值再返回
                     finally {
                     return i + 5;//i = 4 + 5 = 9
             */

        }
//        System.out.println("程序继续……");
//        return 0;
    }

    public static void testAge() {
        System.out.println("请输入一个年龄，必须是一个小于200的整数");
        while (true) {
            //创建scanner对象接收年龄
            Scanner scanner = new Scanner(System.in);
            String initAge = null;
            int age = 0;
            try {
                initAge = scanner.nextLine();
                age = Integer.parseInt(initAge);
                if (age >= 18 && age < 200) {
                    System.out.println("已成年，可以正常进入系统");
                    break;
                } else if (age < 18 && age >= 1) {
                    System.out.println("对不起，您是未成年，需要在家长的陪同下进入系统，不支持您私自访问");
                    break;
                } else {
                    System.out.println("您输入的数不正确，请重新输入");
                }
            } catch (Exception e) {
                System.out.println("对不起，您必须输入一个小于200的整数数字");
            }
        }
    }

}
