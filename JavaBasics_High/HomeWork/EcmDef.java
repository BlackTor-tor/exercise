package JavaBasics_High.HomeWork;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/3/3 19:24
 * @ע�� 1����д��EcmDef�����������е���������(����)�������������
 * 2�����������������Ҫ��ʹ�÷��� cal(int n1,int n2)
 * 3��������ʽ����ȷ(NumberformatException)��ȱ�������в���(ArraylndexOutOfBoundsException)����0�����쳣����(ArithmeticException).
 */
public class EcmDef {

    public static double[] show() {
        // 1�� ����һ�������飬���������������������в���
        double[] nums = new double[2];
        //2������Scanner����������������в�������whileѭ��
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("�������һ������");
                nums[0] = scanner.nextDouble();
                System.out.println("������ڶ�������");
                nums[1] = scanner.nextDouble();
            } catch (NumberFormatException ne) {
                ne.getMessage();
                System.out.println("�������������ȷ������������");
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

    //3�������������㷽��
    public static double cal(double num1, double num2) {
        double result = 0;
        try {
            result = num1 / num2;//�����Ҫ�Խ�������жϴ������鲻Ҫֱ��return��������Ƕ���һ����ʱ�����洢�����������֮���ٽ��з��ء�
        } catch (ArithmeticException ae) {
            ae.getMessage();
            System.out.println("��������Ϊ0������������");
            show();
        }
        return result;
    }

}

