package JavaBasics_High.DesignMode;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/24 10:57
 * @ע��  ����ģʽ����������ֻ����һ������
 */
public class Single {
    public static void Single_Hunger() {
        //����ʽ
        //ֻ������ȥ��ȡһ������ģʽ��Ķ����ʵ��
        Hunger hunger = Hunger.instance();
        System.out.println(hunger);
    }
    public static void Single_Lazy() {
        //����ʽ
        Lazy lazy = Lazy.instance();
        System.out.println(lazy);
    }
}

/**
 * @Author: tor
 * @Description:  ����ģʽ��������ʽ
 *  ���ڶ���ʽ�Ľ��ͣ��������ò�������࣬�������ʵ���Ĵ����������Դ���˷ѣ��߳��ǰ�ȫ�ġ�
 * @Date: 2022/7/24 11:18
 * @Params:
 * @Return:
 **/
class Hunger {
    private String name;
    //��������Ҫ˽�л�
    private Hunger(String name) {
        this.name = name;
    }
    //����ʵ��Ҳ��Ҫ˽�л�������Ϊ��̬��
    private static Hunger blackTor = new Hunger("����ʽ");
    //������ṩһ�������ľ�̬��ʵ������ķ���
    public static Hunger instance() {
        return blackTor;
    }

    @Override
    public String toString() {
        return "Hunger{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * @Author: tor
 * @Description: ����ģʽ��������ʽ
 * ��������ʽ�Ľ��ͣ���Ҫ�õ���ʱ����ͨ���ṩ�˴���ʵ���ķ���ȥnew
 * �������������Դ���˷ѣ��������̲߳���ȫ�����⣬Ч�ʵ͡�
 * @Date: 2022/7/24 12:13
 * @Params:
 * @Return:
 **/
class Lazy {
    private String name;
    //��̬˽��ʵ�������Ȳ�new
    private static Lazy lazy;
    //�ṩһ�������ľ�̬��ȡ��ʵ���ķ���
    public static Lazy instance() {
        if (lazy == null) {
            lazy = new Lazy("����ʽ");
        }
        return lazy;
    }
    private Lazy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lazy{" +
                "name='" + name + '\'' +
                '}';
    }
}
