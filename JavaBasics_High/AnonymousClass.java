package JavaBasics_High;


/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/28 12:25
 * @ע�� �����ڲ�����ϰ
 */
public class AnonymousClass {
    /**
     * @Author: tor
     * @Description:  ���ڼ̳е������ڲ���
     * @Date: 2022/11/29 10:38
     * @Params: []
     * @Return: void
     **/
    public void AnonymousTest() {

        //����1
        Father father = new Father() {
            public String name;
        };
        father.test();//����Ǽ̳й�ϵ�������ڲ��࣬�����ڸ���Ҳ��������ͬ���ֵķ�����������Ķ����޷��ҵ���
                            // ��������ö���ȥ���ã����Բ���Ҫ�͸���һ�����Ƿ�ʹ�ö�����û����������ã�ȡ�����Ƿ���Ҫ�õ��������
        //����2
        new Father() {
            public String name;
            public void test2() {//���಻��Ҫ��test2����
                System.out.println("�����ڲ����test2����");
            }
        }.test2();
    }
}

class Father {
//    public Father(String name) {
//        System.out.println(name);
//    }
    public void test() {
        System.out.println("�����test����");
    }
}
