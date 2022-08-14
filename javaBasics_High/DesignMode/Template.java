package javaBasics_High.DesignMode;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/8/14 10:47
 * @ע��  ģ��ģʽ����һ���������������๲�еķ������ڸ������������󷽷���
 *             �ڹ�ͬ�ķ����е��ó��󷽷�������ʵ�ֽ�������ȥ��
 */
abstract public class Template {
    public void print() {
        System.out.println(showSelf());
    }
    abstract public String showSelf();
}
