package JavaBasics_High;

import java.util.Scanner;

@SuppressWarnings("all")
public class ExceptionExercise {
    public static int i = 1;

    public static int testException() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;//�����쳣
            String name = null;
            if (name.equals("tor")) {//��ָ���쳣
            } else {
                return i + 1;
            }
        } catch (ArithmeticException AE) {
            System.out.println("�����쳣��" + AE.getMessage());
            return i + 2;//��ִ��i+2���������������ʱ�����أ���finally���ִ������return�˳�
        } catch (NullPointerException NE) {
            System.out.println("��ָ���쳣��" + NE.getMessage());
            return i + 3;
        } catch (Exception E) {
            System.out.println("�����쳣��" + E.getMessage());
            return i + 4;
        } finally {
            System.out.println("ִ����finally����");
            return i + 5;
            //1�����finally����return����try-catch�ⲻ���д�����ڣ���ʾ�����Ѿ�������
            //2�����finally������return���򲻻�ִ�в����쳣catch���е�return������ִ��finally�е�
            /**
             3�����finallyû��return����catch��return��finally������ڱ����޸ĵĲ�����������ִ�У������ڳ����쳣�Ķ�Ӧcatch��
             ����ı䱻finally�������ı�����ֵ��
              eg��
                     int i = 2;
                     try {
                     int a = 10;
                     int b = 0;
                     int result = a / b;//�����쳣
                    } catch (ArithmeticException AE) {
                     System.out.println("�����쳣��" + AE.getMessage());
                     return i + 2;//i = 4 > temp = 4��i�����ﱻ������һ�£�Ȼ��ֵ����ʱ�������棬Ȼ�����ִ��finally���еĴ���
             ִ����Ϻ��temp�����е�ֵ�ٷ���
                     finally {
                     return i + 5;//i = 4 + 5 = 9
             */

        }
//        System.out.println("�����������");
//        return 0;
    }

    public static void testAge() {
        System.out.println("������һ�����䣬������һ��С��200������");
        while (true) {
            //����scanner�����������
            Scanner scanner = new Scanner(System.in);
            String initAge = null;
            int age = 0;
            try {
                initAge = scanner.nextLine();
                age = Integer.parseInt(initAge);
                if (age >= 18 && age < 200) {
                    System.out.println("�ѳ��꣬������������ϵͳ");
                    break;
                } else if (age < 18 && age >= 1) {
                    System.out.println("�Բ�������δ���꣬��Ҫ�ڼҳ�����ͬ�½���ϵͳ����֧����˽�Է���");
                    break;
                } else {
                    System.out.println("�������������ȷ������������");
                }
            } catch (Exception e) {
                System.out.println("�Բ�������������һ��С��200����������");
            }
        }
    }

}
