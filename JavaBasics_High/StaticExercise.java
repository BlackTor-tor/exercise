package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/24 9:58
 * @ע��  ��̬���
 */
public class StaticExercise {
    //��̬�����
    static {
        System.out.println("���Ǿ�̬�����");
    }
    //��̬����
    public static int s = helloStatic();
    public static double d = 5.0;
    //��̬����
    private static int helloStatic() {
        System.out.println("���Ǿ�̬����");
        return 1;
    }
    //�ڲ���̬��
    static class A {
        public A() {
            System.out.println("�����ڲ���̬��Ĺ�����");
        }
    }

    public void noStatic() {
        System.out.println(d);
    }

    public StaticExercise() {
        System.out.println("��̬��Ĺ�����");
    }

}
