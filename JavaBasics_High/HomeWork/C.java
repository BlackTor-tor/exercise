package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/6 21:51
 * @ע��
 */
public class C {
    double price = 10;
    static String color = "white";//��̬���ԣ���new֮ǰ�ͻ�����������ɳ�ʼ��

    public String toString() {
        return price + "\t" + color;
    }

    public C() {
        this.price = 9;//��10�ĳ���9���Ѿ�̬���Ե�white�޸ĳ���red
        this.color = "red";
    }

    public C(double price) {//�вι��죬������100���ĳ���100����̬���Ա��ĳ���red��
        this.price = price;         // �����ٴ�new�ǲ����صģ�ֻ��һ���������ڣ�����color����red
    }
}
