package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/30 16:15
 * @ע��
 */
public class ClassLoad {
    public static void main(String[] args) {
        //���þ�̬�����Ի򷽷��ᵼ������أ�����ػ�ִ�о�̬�����Ĵ��룬Ȼ�����ʾ���õĽ��
//        System.out.println(Father.num);
//        new Father();
//        new Son();
        new Son("����");
//        Father.fhello();
//        new father();//һ������������ͨ�����͹������������Ŷ���Ĵ�����������
//        new Father();

    }
}
class Father {
    public static int num = 1;
    public static void fhello() {
        System.out.println("���ྲ̬����");
    }
    /*
    1����ʲôʱ�򱻼��أ�
    (1)��������ʵ��ʱ(new)
    (2)�����������ʵ��������Ҳ�ᱻ����
    (3)ʹ����ľ�̬��Աʱ(��̬���ԣ���̬����)
    2�������˳��(��Ҫ!!!)
     ��̬����� > (����е��þ�̬������������) > ��ͨ����� > ���๹���� > ���๹����
     �м̳й�ϵʱ���������������ȼ��ظ��ִ࣬��˳���ǣ�
     ���ྲ̬����� > ���ྲ̬����� > ������ͨ����� > ���๹���� > ������ͨ����� > ���๹����
     */
    {
        System.out.println("������ͨ�����");//ÿ�δ������󶼻ᱻ����һ��
    }
    static {
        System.out.println("���ྲ̬�����");
    }

    public Father() {
        System.out.println("���๹����");//ÿ�δ������󶼻ᱻ����һ��
    }
}

class Son extends Father {
    public Son() {
        //super();//����������һ��super()���ഴ������Ĭ�ϻ���г�ʼ������Ĺ�����
        System.out.println("���๹����");
    }
    public Son(String name) {
        System.out.println("�����вι�����");
    }

    static {
        System.out.println("���ྲ̬�����");
    }
    {
        System.out.println("������ͨ�����");
    }
    public static void shello() {
        System.out.println("���ྲ̬����");
    }
}
