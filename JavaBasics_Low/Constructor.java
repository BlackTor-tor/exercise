package JavaBasics_Low;

public class Constructor {
    String name = "С����";//���������и�С�����ֵ
    /*
    Constructor() {//javaĬ�ϵĹ�����������ĸ�����
    }
    * */

    /*˵�������������ɱ�������ʵ���Ҳ����˵���޷�ʹ�ö���ȥ���ù�����������ֻ��ͨ��new��ʱ���ʼ����
            /*
        �������´��룺
         Constructor c1 = new Constructor();//�����������ִ���ˡ�
        System.out.println("1" + c1.name);//Ů��
        c1.name = "����";
        System.out.println("2" + c1.name);//����

        1������new Constructor()����ʱ�򣬹�������ִ���ˣ�Ȼ���name��ֵ���Ů��
        ���ԡ�1+c1.name����Ů�񣬹��췽������ĳ�ʼ������name�������ˣ�����ѡ�name="Ů��"��ע�͵�����ô��1+c1.name������С����
        2������c1.name="����"������ִ��ʱ���ְ�name��ֵ�ĳ������㣬����2+c1.name�������㡣
        * */
    public Constructor() {//�޲ι�����
        System.out.println("������ִ���ˡ�");
        name = "Ů��";//��������name���Եĵ�ַ���ҵ������ص�Ů���ֵ����Ů��ֵ��name��С�������ֵ�޶�����ʣ������ա�
    }

    public Constructor(int age,int height,int weight) {//�вι�����
//        age = 20;
        System.out.println(age);
//        height = 180;
        System.out.println(height);
//        weight = 60;
        System.out.println(weight);
    }
}
