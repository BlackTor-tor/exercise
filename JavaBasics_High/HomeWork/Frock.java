package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/6 21:52
 * @ע��
 */
public class Frock {
    //1����Frock��������˽�еľ�̬����currentNum[int����]����ʼֵΪ100000����Ϊ�·����������к���ʼֵ��
    private static int currentNum = 100000;
    // 4����Frock��������serialNumber(���к�)���ԣ����ṩ��Ӧ��get����;
    private int serialNumber;//���к�
    //2���������еľ�̬����getNextNum����Ϊ��������Ψһ���кŵķ�����ÿ����һ�Σ�
    //     ��currentNum����100������Ϊ����ֵ��
    public static int getNextNum() {
       return currentNum += 100;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    //5����Frock��Ĺ������У�ͨ������getNextNum����ΪFrock�����ȡΨһ���кţ�����serialNumber����
    Frock() {
        serialNumber = getNextNum();
    }
}
