package JavaBasics_High;
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
            }else {
                return i+1;
            }
        }catch (ArithmeticException AE) {
            System.out.println("�����쳣��" + AE.getMessage());
            return i+2;//��ִ��i+2���������������ʱ�����أ���finally���ִ�����ٷ���i��ֵ
        }catch (NullPointerException NE) {
            System.out.println("��ָ���쳣��" + NE.getMessage());
            return i+3;
        }catch (Exception E) {
            System.out.println("�����쳣��" + E.getMessage());
            return i+4;
        }
        finally {
            System.out.println("ִ����finally����");
            return i+5;//���,finally����return����try-catch�ⲻ���д�����ڣ���ʾ�����Ѿ�������
                       //���⣬���finally������return���򲻻�ִ�в����쳣catch���е�return������ִ��finally�е�
        }
//        System.out.println("�����������");
//        return 0;
    }

}
