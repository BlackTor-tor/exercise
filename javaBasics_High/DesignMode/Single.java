package javaBasics_High.DesignMode;

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
        BlackTor_Hunger blackTor_hunger = BlackTor_Hunger.instance();
        System.out.println(blackTor_hunger);
    }
    public static void Single_Lazy() {
        //����ʽ
        BlackTor_Lazy blackTor_lazy = BlackTor_Lazy.instance();
        System.out.println(blackTor_lazy);
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
class BlackTor_Hunger {
    private String name;
    //��������Ҫ˽�л�
    private BlackTor_Hunger(String name) {
        this.name = name;
    }
    //����ʵ��Ҳ��Ҫ˽�л�������Ϊ��̬��
    private static BlackTor_Hunger blackTor = new BlackTor_Hunger("����ж���ʽ");
    //������ṩһ�������ľ�̬��ʵ������ķ���
    public static BlackTor_Hunger instance() {
        return blackTor;
    }

    @Override
    public String toString() {
        return "BlackTor_Hunger{" +
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
class BlackTor_Lazy {
    private String name;
    //��̬˽��ʵ�������Ȳ�new
    private static BlackTor_Lazy blackTor_lazy;
    //�ṩһ�������ľ�̬��ȡ��ʵ���ķ���
    public static BlackTor_Lazy instance() {
        if (blackTor_lazy == null) {
            blackTor_lazy = new BlackTor_Lazy("���������ʽ");
        }
        return blackTor_lazy;
    }
    private BlackTor_Lazy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BlackTor_Lazy{" +
                "name='" + name + '\'' +
                '}';
    }
}
