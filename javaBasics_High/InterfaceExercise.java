package javaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/8/14 21:24
 * @ע��
 */
public interface InterfaceExercise {
    //�ӿڵ�����
    String name = "�ӿ�";

    default public void commonMethod() {
        System.out.println("�ӿڵ���ͨ����");
    }

    public static void staticMethod() {
        System.out.println("�ӿڵľ�̬����");
    }

    abstract public void abstractMethod();//abstract����ʡ��

    abstract public void abstractMethod2();
}
