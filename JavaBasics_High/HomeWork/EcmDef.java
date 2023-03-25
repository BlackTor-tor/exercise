package JavaBasics_High.HomeWork;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/3/3 19:24
 * @注释 1、编写类EcmDef，接收命令行的两个参数(整数)，计算两数相除
 * 2、计算两个数相除，要求使用方法 cal(int n1,int n2)
 * 3、对数格式不正确(NumberformatException)、缺少命令行参数(ArraylndexOutOfBoundsException)、除0进行异常处理(ArithmeticException).
 */
public class EcmDef {

    public static double[] show() {
        // 1、 定义一个空数组，用两个变量来保存命令行参数
        double[] nums = new double[2];
        //2、创建Scanner对象接收两个命令行参数，用while循环
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入第一个整数");
                nums[0] = scanner.nextDouble();
                System.out.println("请输入第二个整数");
                nums[1] = scanner.nextDouble();
            } catch (NumberFormatException ne) {
                ne.getMessage();
                System.out.println("您输入的数不正确，请重新输入");
                continue;
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                continue;
            } catch (Exception e) {
                e.printStackTrace();
//                break;
            }
            break;
        }
        return nums;
    }

    //3、创建除数计算方法
    public static double cal(double num1, double num2) {
        double result = 0;
        try {
            result = num1 / num2;//如果需要对结果进行判断处理，则建议不要直接return结果，而是定义一个临时变量存储，处理好数据之后再进行返回。
        } catch (ArithmeticException ae) {
            ae.getMessage();
            System.out.println("除数不能为0，请重新输入");
            show();
        }
        return result;
    }

}

