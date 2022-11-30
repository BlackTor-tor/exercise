package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/13 16:20
 * @ע�� �ڲ�����ϰ
 */
public class InnerClass {//�ⲿ������

    //�ⲿ����ڲ����Ӧ��
    public void innerClassTest() {
        //1������һ�������ⲿ�����ͨ�������ⲿ���з����ڲ��෽���ķ���ȥ�����ڲ���ķ�����
        // ���߷����ⲿ��(��Ȩ�޷�Χ��)�Լ������Ժͷ���
        OutClass outClass = new OutClass();
        //System.out.println(outClass.name);
//        outClass.test();
//        outClass.outMethod();
        //2���������������ڲ�����󣬷����Լ�(��Ȩ�޷�Χ��)�����Ժͷ���
        OutClass.InClass inClass = outClass.new InClass();
        inClass.InnerMethod();
//        System.out.println(inClass.name);
//        System.out.println(outClass);//@14ae5a5
//        System.out.println(inClass);//@7f31245a

        /*
        �ܽ᣺��һ�ַ����ǰѶ����װ�ڷ�����ȥ���ʷ�������ȫ�Ըߡ�
        ����ȱ���ǲ�����ά�����룬����ڲ��������ӻ����޸ķ������ⲿ��ķ�����Ҳ��Ҫȥ�޸ġ��ȽϷ���
        �ڶ��ַ������ö���ʵ��ֱ��ȥ�����Լ������Ժͷ������Ƚ������ַ���������Ҫȥѡ��
        */
    }
}

class OutClass {//�ⲿ��
    public String name = "���";
    private int outNum = 1;

    public void outMethod() {
        System.out.println("�ⲿ�෽��");
    }

    public void test() {
        System.out.println("�ⲿ��OutClass��test����");
        InClass inClass = new InClass();
        inClass.InnerMethod();
        inClass.test2();
    }

    private void test2() {
        System.out.println("˽�е��ⲿ�෽��");
    }

    class InClass {//�ڲ���
        public String name = "�����";
        private int outNum = 100;

        public void InnerMethod() {
            System.out.println("�ڲ��෽��");
            System.out.println(outNum);//100
            System.out.println(OutClass.this.outNum);//1
            outMethod();//�ⲿ�෽��
            OutClass.this.outMethod();//�ⲿ�෽��
            test();
//            test2();
//            OutClass.this.test2();
            System.out.println(OutClass.this);//���õ�ַָ����@14ae5a5��System.out.println(outClass)��һ�µġ�˵��OutClass.this��ʵ�����ⲿ��Ķ����ڵ���
        }

        private void test2() {
            System.out.println("˽�е��ڲ��෽��");
//            test();//����ⲿ����ڲ���ͬʱ������ͬ�������ķ��������ڲ��������ȵ��õ����Լ���
        }

        public void test() {
            System.out.println("�ڲ���inClass��test����");
        }
    }
}