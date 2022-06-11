import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {
    /*
    * 1����д��A01�����巽��max��ʵ����ĳ��double��������ֵ�������ء�
    * */
    public static class A01 {
        public double max(double[] array) {
            double min = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    //�Ƚ�������Ԫ�صĴ�С�����������Ǹ�ֵ
                    if (array[j] < array[j + 1]) {
                        min = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = min;
                    }
                }
            }
            return array[0];
        }
    }

    /*
    * 2����д��A02�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ��������У�����������������Ҳ���������-1
    * */
    public  class A02 {
        public int find(String[] strArray) {
            //����Scanner����Ҫ��ѯ���ַ���
            Scanner scanner = new Scanner(System.in);
            System.out.println("������Ҫ��ѯ���ַ�����");
            String str = scanner.next();

            //�������ַ�������
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].equals(str)) {
                    return i;
                }
            }
            return -1;
        }
    }

        /*
        *    3����д��book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸񡣾��壺����۸�>150,�����Ϊ150������۸�>100������Ϊ100�����򲻱�
        *  */
        public class Book {
            public int updatePrice(int price) {
                if (price > 150) {
                    price = 150;
                    return price;
                }else if (price > 100 && price < 150) {
                    price = 100;
                    return price;
                }
                return price;
            }
    }

        /*
        *     4����д��A03��ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��
        * */
        public class A03 {
            public int[] copyArr(int[] array) {
                int[] newArray = new int[array.length];
                for (int i = 0,j = 0; i < array.length; i++,j++) {
                   newArray[j] = array[i];
                }
                System.out.println(array.hashCode());
                array  = newArray;
                System.out.println(array.hashCode());
                return array;
            }
        }

        /*
        *     5������һ��Բ��Circle���������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾԲ����ķ���
        *   Բ�ܳ���ʽ��c=2�С�r
        *   Բ�����ʽ��S=�С�r?
        * */
            public class Circle1 {
                private double radius;
                public double getRadius() {
                    return radius;
                }

                public void setRadius(double radius) {
                    this.radius = radius;
                }
                public double getCircum() {//��Բ�ܳ�
                    double c = radius*2*Math.PI;
                    return c;
                }
                public double getCircular() {//��Բ���
                    double s = radius*radius*Math.PI;//1
//                    double s = Math.pow(radius,2)*Math.PI;//2
                    return s;
                }
        }

                /*
                *   6����̴���һ��Cale�����࣬�����ж���2��������ʾ�����������������ĸ�����ʵ����͡���ˡ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ��
    �������������󣬷ֱ����
                *  */
                public class Cale {
                    public double getSum(double num1,double num2) {//���
                        double sum = num1 + num2;
                        return sum;
                    }
                    public double getSub(double num1,double num2) {//���
                        double sub = num1 - num2;
                        return sub;
                    }
                    public double getMul(double num1,double num2) {//���
                        double mul = num1*num2;
                        return mul;
                    }
                    public double getDiv(double num1,double num2) {//���
                        if (num1 == 0) {
                            System.out.println("0������Ϊ����");
                        }else {
                            double div = num1/ num2;
                            return div;
                        }
                        return -1;
                    }
    }

            /*
             *   7�����һ��dog�࣬�����֡���ɫ���������ԣ������������show()��ʾ����Ϣ�����������󣬽��в��ԡ�
             * */
                    public class Dog {
                        private String dogName;
                        private String dogColor;
                        private int dogAge;

                    public void show(String dogName,String dogColor,int dogAge) {
                        System.out.println("���������ǣ�" + (this.dogName = dogName));
                        System.out.println("������ɫ�ǣ�" + (this.dogColor = dogColor));
                        System.out.println("���������ǣ�" + (this.dogAge = dogAge));
                    }
            }

            /*
            *     8������һ��java����Ĵ���������ʾ����������к��������� ��10,10
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
                        t1.count1();//9
                        t1.count2();//10
                    }
            }
            * */
            public static class Test {
                int count = 9;
                public void count1() {
                    count = 10;
                    System.out.println("count1=" + count);
                }
                public void count2() {
                    System.out.println("count1=" + count++);
                }
                }

                /*
                *     9������Music�࣬������������name������ʱ��times���ԣ����в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
                * */
                    public class Music {
                        private String musicName;
                        private double times;
                        public void play() {
                            System.out.println("��ʼ���Ÿ�����" + musicName);
                            if (times > 60) {
                                times /= 60;
                            }
                            BigDecimal bigDecimal =new BigDecimal(times);
                            times = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();//��������
                            System.out.println("����ʱ����" + times+ "��");
                        }
                        public void getInfo(String musicName,int times) {
                            this.musicName = musicName;
                            this.times = times;
                        }
                }

                /*
                *     10����д�����´�������н����i=101��j=100��101��101
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
                * */
                    public class Demo {
                    int i = 100;
                    public void m() {
                        int j = i++;
                        System.out.println("i=" + i);
                        System.out.println("j=" + j);
                    }
                }

                /*
                *     11���ڲ��Է����У�����method�������������£�������ȷ����д��method�����Ķ�����ʽ��
                * �������Ϊ��System.out.println(method(method(10.0,20.0),100))
                * */
                    public double method(double d1,double d2) {
                        return d1 + d2;
                    }

                /*
                *     12������һ��Employee�࣬�����У����֣��Ա����䣬ְλ��нˮ�����ṩ3�����췽�������Գ�ʼ����
                            ��1�����֣��Ա����䣬ְλ��нˮ
                            ��2�����֣��Ա�����
                            ��3��ְλ��нˮ
                            Ҫ���ָ��ù�����
                * */
                    public class Employee {
                        private String name;
                        private String gender;
                        private int age;
                        private String job;
                        private int salary;

                        public Employee() {
                            System.out.println("�޲ι���ִ����");
                        }
                        public Employee(String name, String gender, int age, String job, int salary) {
                        this.name = name;
                        this.gender = gender;
                        this.age = age;
                        this.job = job;
                        this.salary = salary;
                        System.out.println("�вι���ִ����");
                    }
                        public Employee(String name,String gender,int age) {
                        this.name = name;
                        this.gender = gender;
                        this.age = age;
                    }
                        public Employee(String job,int salary) {
                        this.job = job;
                        this.salary = salary;
                    }
                }

                /*
                *     13����������Ϊ�������ݸ�����
                    ��ĿҪ��
                    ��1������һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�������        ***Բ�����ʽ��S=�С�r?
                    ��2������һ����PassObject�������ж���һ������printArea()���÷����Ķ������£�
                        public void printAreas(Circle c,int times)      //����ǩ��/����
                    ��3����printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
                        ���磺timesΪ5ʱ��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
                    ��4����main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н����ͼ��ʾ
                * */
                public class Circle2 {
                    private double radius;
                    public double findArea() {
                        return Math.PI*Math.pow(radius,2);
                    }
                }
                public class PassObject {
                    Scanner scanner =new Scanner(System.in);
                    public void printAreas(Circle2 c,int times) {
                        System.out.println("��������Ҫ��ѯ�������ڵ�Բ����������뾶ֵ��");
                        times = scanner.nextInt();
                        System.out.print("Radius" + "\t\t" + "Area" + "\n");
                        double s = 0;
                        for (int i = 0; i < times; i++) {
                            c.radius = i + 1;
                            for (int j = 0; j < times - i; j++) {
                                s = c.findArea();
                            }
                            System.out.println(c.radius + "\t\t\t" + s);
                        }
                    }
                }

                /*
                *
                14���и���Tom������ĳ�Ա��������Ա���������Ե��Բ�ȭ������ÿ�ζ����������0��1��2
                0��ʾʯͷ��1��ʾ������2��ʾ������Ҫ������ʾTom����Ӯ����
                * */
                    public class Person {
                        private  final int stone = 0;//ʯͷ
                        private  final int scissor = 1;//����
                        private  final int cloth = 2;//��
                        private String Stone = "ʯͷ";
                        private String Scissor = "����";
                        private String Cloth = "��";
                        int winTimes;
                        int lostTimes;
                        int sameTimes;
                    public int getStone() {
                        return stone;
                    }
                    public int getScissor() {
                        return scissor;
                    }
                    public int getCloth() {
                        return cloth;
                    }
                    public  class Computer {
                        int randomGuess() {
                            Random random = new Random();
                            return random.nextInt(3);
                        }
                    }
                    public void fingerGuessGame(int num,Computer computer) {
                        int comTempRecord = computer.randomGuess();//��¼���Եĳ�ȭ
                        if(num == 0) {
                            if (num <= comTempRecord) {//ʯͷ����Ӯ�߼�
                                if (comTempRecord == num) {
                                    sameTimes++;
                                    System.out.println("������˼�����ƽ�֣�����սһ��!");
                                } else if (comTempRecord == 1) {
                                    winTimes++;
                                    System.out.println("������ǣ�" + Stone + "\n" + "���Գ����ǣ�����\t" + "��Ӯ�ˣ�");
                                } else {
                                    lostTimes++;
                                    System.out.println("������ǣ�" + Stone + "\n" + "���Գ����ǣ���\t" + "�����ˣ�");
                                }
                            }
                        }else if(num == 1) {
                            if (num <= comTempRecord) {//��������Ӯ�߼�
                                if (comTempRecord == num) {
                                    sameTimes++;
                                    System.out.println("������˼�����ƽ�֣�����սһ��!");
                                } else {
                                    winTimes++;
                                    System.out.println("������ǣ�" + Scissor + "\n" + "���Գ����ǣ���\t" + "��Ӯ�ˣ�");
                                }
                            } else {
                                lostTimes++;
                                System.out.println("������ǣ�" + Scissor + "\n" + "���Գ����ǣ�ʯͷ\t" + "�����ˣ�");
                            }
                        }else {
                            if (num >= comTempRecord) {//������Ӯ�߼�
                                if (comTempRecord == num) {
                                    sameTimes++;
                                    System.out.println("������˼�����ƽ�֣�����սһ��!");
                                } else if (comTempRecord == 1) {
                                    lostTimes++;
                                    System.out.println("������ǣ�" + Cloth + "\n" + "���Գ����ǣ�����\t" + "�����ˣ�");
                                }else {
                                    winTimes++;
                                    System.out.println("������ǣ�" + Cloth + "\n" + "���Գ����ǣ�ʯͷ\t" + "��Ӯ�ˣ�");
                                }
                            }
                         }
                        }
                    }

}
