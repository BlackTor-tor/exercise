package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/13 16:20
 * @ע��  �ڲ�����ϰ
 */
public class InnerClass {//�ⲿ������
    //�ⲿ����ڲ����Ӧ��
    public void innerClassTest() {
        OutClass outClass = new OutClass();
        outClass.Test();
    }
}

class OutClass {//�ⲿ��
    private int outNum = 1;
    public void outMethod() {
        System.out.println("�ⲿ�෽��");
    }
    public void Test() {
        InClass inClass = new InClass();
        inClass.InnerMethod();
    }
    class InClass {//�ڲ���
        private int outNum = 100;
        public void InnerMethod() {
            System.out.println(outNum);//100
            System.out.println(OutClass.this.outNum);//1
            OutClass.this.outMethod();//�ⲿ�෽��
            System.out.println("�ڲ��෽��");
        }
    }
}