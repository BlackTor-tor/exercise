package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/4/2 12:55
 * @ע�� װ��Ͳ���
 */

public class PackClass {
    int number1;
    int number2;
    public Integer inPack() {//װ��
    //1. �ֶ�װ��Ͳ��� --jdk5��ǰ�����ַ�����һ�����ֱ�ɰ�װ��
    number1 = 100;
//    Integer integer1 = new Integer(number1);
    Integer integer2 = Integer.valueOf(number1);
//    return integer1;//100
    return integer2;
    }

    public int outPack() {//���
    //2. �ֶ�����
    return inPack().intValue();//100
    }

    //JDK5�Ժ����ʵ���Զ�װ/����
    //3. �Զ�װ��
    public Integer inPack2() {
        //ֱ�Ӱ�һ��int���͵����ָ�ֵ����Ӧ�İ�װ��Integer
        Integer integer3 = 200;//�ײ������integer.valueof(int number)�ķ���
        return integer3;
    }

    //4. �Զ�����
    public int outPack2() {
        //ֱ�Ӱ�һ����װ��Integer��ֵ��int
        int number3 = inPack2();//�ײ���õ���intValue()����
        return number3;
    }


}
