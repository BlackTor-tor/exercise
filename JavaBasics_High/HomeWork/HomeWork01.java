package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/6 20:18
 * @ע��
 */
public class HomeWork01 {
/*
һ��1.��д�����´����ִ�н����
     C c =new C();
     C c1=new C(100);
     System.out.println(c);//9.0,red
     System.out.println(c1);//100.0,red
     -------------------------------------------------
     class C {
         double price=10;
         static String color="white";//��̬���ԣ���new֮ǰ�ͻ�����������ɳ�ʼ��
         public String toString() { return price +"\t" + color; }
         public C { this.price=9;this.color= "red"; }//��10�ĳ���9���Ѿ�̬���Ե�white�޸ĳ���red
         public C(double price) { this.price=price; }//�вι��죬������100���ĳ���100����̬���Ա��ĳ���red��
                                                                                 �����ٴ�new�ǲ����صģ�ֻ��һ���������ڣ�����color����red
 */

/*����
    1����Frock��������˽�еľ�̬����currentNum[int����]����ʼֵΪ100000����Ϊ�·����������к���ʼֵ��
    2���������еľ�̬����getNextNum����Ϊ��������Ψһ���кŵķ�����ÿ����һ�Σ�
     ��currentNum����100������Ϊ����ֵ��
    3����TestFrock���main�����У������ε���getNextNum��������ȡ���кŲ���ӡ���
    4����Frock��������serialNumber(���к�)���ԣ����ṩ��Ӧ��get����;
    5����Frock��Ĺ������У�ͨ������getNextNum����ΪFrock�����ȡΨһ���кţ�����serialNumber����
    6����TestFrock���main�����У��ֱ𴴽�����Frock ���󣬲���ӡ������������кţ���֤�Ƿ�Ϊ��100������
 */

/*
������Ҫ��ʵ����������:
            1.������Animal�����˳��󷽷� shout();
            2.Cat��̳���Animal����ʵ�ַ���shout����ӡ��è�������С�
            3.Dog��̳���Animal����ʵ�ַ���shout����ӡ�����������С�
            4.�ڲ�������ʵ��������Animal cat =new Cat0������cat��shout����
            5.�ڲ�������ʵ��������Animal dog=new Dog(),������dog��shout����
*/

/*
�ġ�
    1.�������ӿھ���work���������������㣬��һ���ֻ���Cellphone�����巽��testWork���Լ��㹦�ܣ�
    ���ü���ӿڵ�work������
    2.Ҫ�����CellPhone�����testWork������ʹ���������ڲ���
*/

/*
�塢
    1.��һ����A�������ж���ֲ��ڲ���B��B����һ��˽��final����name����һ������show()��ӡ����name��
    ���в���
    2.����:A��Ҳ����һ��˽�еı���name.��show�����д�ӡ����
*/

/*
����
    1.��һ����ͨ���߽ӿ���Vehicles����work����
    2.��Horse���Boat��ֱ�ʵ��Vehicles
    3.������ͨ���߹����࣬�����������ֱ��ý�ͨ����Horse��Boat
    4.��Person�࣬��name��Vehicles���ԣ��ڹ�������Ϊ�������Ը�ֵ
    5.ʵ����Person������ɮ����Ҫ��һ���������Horse��Ϊ��ͨ����,�������ʱ��Boat��Ϊ��ͨ����
*/

/*
�ߡ�
    ��һ��Car�࣬������temperature (�¶�)��������Air (�յ�)�࣬�д���Ĺ���flow,Air����ӳ��ڵ��¶ȣ�
    ����¶ȳ���40��������������¶ȵ���0����ů�����������֮����ص��յ���ʵ�������в�ͬ�¶ȵ�Car����
    ���ÿյ���flow���������Կյ����ķ��Ƿ���ȷ��//���� ������İ�����ϵ�İ��� ��(�ڲ���[��Ա�ڲ���])
*/

/*
 �ˡ�
    1.����һ��Colorö����
    2.��RED,BLUE,BLACK,YELLOW,GREEN������ö��ֵ/����;
    3.Color����������redValue��greenValue��blueValue
    4.�������췽����������������������
    5.ÿ��ö��ֵ��Ҫ�����������Ը�ֵ���������Զ�Ӧ��ֵ�ֱ���
    6.red: 255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
    7.����ӿڣ������з���show��Ҫ��Colorʵ�ָýӿ�
    8.show��������ʾ�����Ե�ֵ
    9.��ö�ٶ�����switch�����ƥ��ʹ��
*/

    public static void main(String[] args) {
        //һ����һ��ʵ��
//        C c =new C();
//        C c1=new C(100);
//        System.out.println(c);//9.0,red
//        System.out.println(c1);//100.0,red

        //�����ڶ���ʵ��
//        //3����TestFrock��(HomeWork01)��main�����У������ε���getNextNum��������ȡ���кŲ���ӡ���
//        System.out.println(Frock.getNextNum());
//        System.out.println(Frock.getNextNum());
//        //6����TestFrock��(HomeWork01)��main�����У��ֱ𴴽�����Frock ���󣬲���ӡ������������кţ���֤�Ƿ�Ϊ��100������
//        Frock frock1 = new Frock();
//        Frock frock2 = new Frock();
//        Frock frock3 = new Frock();
//        System.out.println(frock1.getSerialNumber());
//        System.out.println(frock2.getSerialNumber());
//        System.out.println(frock3.getSerialNumber());

        //����������ʵ��
//        Animal cat = new Cat();
//        cat.shout();

        //�ġ�������ʵ��
//        Cellphone cellphone = new Cellphone();
//        cellphone.testWork(new Calculator() {
//            @Override
//            public int work(int num1, int num2) {
//                return num1 + num2;
//            }
//        }, 10, 20);
//        cellphone.testWork(new Calculator() {
//            @Override
//            public int work(int num1, int num2) {
//                return num1 * num2;
//            }
//        }, 10, 20);

        //�塢������ʵ��
//        A a = new A();
//        a.show();
//    }

        //����������ʾ��
//        Person tangsen = new Person("��ɮ", new Horse());
//        tangsen.fly();
//        tangsen.land(tangsen);
//        tangsen.swim();
//        Person bajie = new Person("�˽�",new Boat());
//        bajie.fly();
//        bajie.land(bajie);
//        bajie.swim();

        //�ߡ�������ʵ��
//        Car car1 = new Car(30.0);
//        Car car2 = new Car(50.0);
//        Car car3 = new Car(-30.0);
//        car1.new Air().monitor();
//        car2.new Air().monitor();
//        car3.new Air().monitor();

        //�ˡ��ڰ���ʵ��
        //��switch������ö�ٶ���ֵ
//        Color black = Color.BLACK;
//        Color blue = Color.BLUE;
//        Color red = Color.RED;
//        Color green = Color.GREEN;
//        Color yellow = Color.YELLOW;
//        Color gary = GAXY;
//        black.show();
//        blue.show();
//        red.show();
//        green.show();
//        yellow.show();
        //��switch�з��봴����ö�ٶ���ÿ��case����д��ö�����ж����ö�ٶ���
//        switch (gary) {
//            case BLACK :
//                System.out.println("��ɫ");
//                break;
//            case RED :
//                System.out.println("��ɫ");
//                break;
//            case BLUE :
//                System.out.println("��ɫ");
//                break;
//            case GREEN :
//                System.out.println("��ɫ");
//                break;
//            case YELLOW :
//                System.out.println("��ɫ");
//                break;
//            default :
//                System.out.println("û�������ɫ");
//        }
    }
}

