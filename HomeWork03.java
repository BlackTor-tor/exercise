public class HomeWork03 {
    /*

    2����д��A02�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ��������У�����������������Ҳ���������-1

    3����д��book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸񡣾��壺����۸�>150,�����Ϊ150������۸�>100������Ϊ100�����򲻱�

    4����д��A03��ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��

    5������һ��Բ��Circle���������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾԲ����ķ���

    6����̴���һ��Cale�����࣬�����ж���2��������ʾ�����������������ĸ�����ʵ����͡���ˡ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ��
    �������������󣬷ֱ����

    7�����һ��dog�࣬�����֡���ɫ���������ԣ������������show()��ʾ����Ϣ�����������󣬽��в��ԡ�

    8������һ��java����Ĵ���������ʾ����������к��������� ��
    public static class Test {
        int count = 9;
        public void count1() {
            count = 10;
            System.out.println("count1=" + count);
        }
        public void count2() {
            System.out.println("count1=" + count++);
        }

        public static void main(String[] args) {
            new Test().count1();
            Test t1 = new Test();
            t1.count1();
            t1.count2();
        }
    }

    9������Music�࣬������������name������ʱ��times���ԣ����в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo

    10����д�����´�������н����
    public class Demo {
        int i = 100;
        public void m() {
            int j = i++;
            System.out.println("i=" + i);
            System.out.println("j=" + j);
        }
    }

    public class Test {
        public static void main(String[] args) {
            Demo d1 = new Demo();
            Demo d2 = d1;
            d2.m();
            System.out.println(d1.i);
            System.out.println(d2.i);
        }
    }

    11���ڲ��Է����У�����method�������������£�������ȷ����д��method�����Ķ�����ʽ��
    �������Ϊ��System.out.println(method(method(10.0,20.0),100))

    12������һ��Employee�࣬�����У����֣��Ա����䣬ְλ��нˮ�����ṩ3�����췽�������Գ�ʼ����
    ��1�����֣��Ա����䣬ְλ��нˮ
    ��2�����֣��Ա�����
    ��3��ְλ��нˮ
    Ҫ���ָ��ù�����

    13����������Ϊ�������ݸ�����
    ��ĿҪ��
    ��1������һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�����
    ��2������һ����PassObject�������ж���һ������printArea()���÷����Ķ������£�
        public void printAreas(Circle c,int times)      //����ǩ��/����
    ��3����printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
        ���磺timesΪ5ʱ��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
    ��4����main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н����ͼ��ʾ

    14���и���Tom������ĳ�Ա��������Ա���������Ե��Բ�ȭ������ÿ�ζ����������0��1��2
    0��ʾʯͷ��1��ʾ������2��ʾ������Ҫ������ʾTom����Ӯ����
    * */

    /*
    * 1����д��A01�����巽��max��ʵ����ĳ��double��������ֵ�������ء�
    * */
    public static class A01 {
        public double max(double[] array) {
            double max = 0;
            for (int  i = 0; i < array.length - 1;i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    //�Ƚ�������Ԫ�صĴ�С�����������Ǹ�ֵ
                    if (array[j] > array[j+1]) {
                        max = array[j];
                    }

            }

            }
            return max;
        }

    }


}
