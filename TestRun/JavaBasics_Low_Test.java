package TestRun;

import java.lang.reflect.InvocationTargetException;

public class JavaBasics_Low_Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //ForExercise.java��ʵ��
//        new ForExercise()..ForExercise();

        //WhileExercise.java��ʵ��
//        new WhileExercise().WhileExercise();

        //ManyForExercise.java��ʵ��
//        new ManyForExercise().manyForExercise();

        //PrintStar.java��ʵ��
//            new TeacherPrintStar().printStar();
//            new MyPrintStar().myPrintStar();

        //ArrayExercise��ʵ��
//        new ArrayExercise().arrayReduce();

        //HomeWork01��ʵ��
//        new HomeWork01().homeWork01();

        //HomeWork02  7��ʵ��
/*        int[] testArr = {100, 10, 55, 8};
        new HomeWork02().bubArr(testArr);
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + "\t");
        }*/

        //Method��ʵ��
//        new Method().printHeart(20,20,"*");

        //MethodExercise��ʵ��
//        new MethodExercise().m1();
//        new MethodExercise().m2();

        //RecursionExercise��ʵ��
//        System.out.println(new RecursionExercise().factorial(4));
//        RecursionExercise RE = new RecursionExercise();
//        System.out.println(RE.monkeyEatPeach(1));
//        RE.eightQueen();

        //Calculator��ʵ��
//        System.out.println(new Calculator().add(1.5,5.0));

        //Constructor��ʵ��
//        Constructor constructor = new Constructor();//�����������ִ���ˡ�
//        System.out.println("1" + c1.name);//Ů��
//        Constructor c2 = new Constructor(20,150,45);

//       homewor03��ʵ��  1
//        double[] testArrayMax = {10.0,3.0,100.0,500.0};
//        System.out.println(new HomeWork03.A01().max(testArrayMax));

//       homewor03��ʵ��  2
        //��һ�ִ����ڲ������ʵ������д��
//        String[] testArr = {"a","black","blacktor","tor"};
//        HomeWork03.A02 hwA02 = new HomeWork03().new A02();
//        int test = hwA02.find(testArr);
//        if (test != -1) {
//            System.out.println("�鵽�ˣ�����");
//        }else {
//            System.out.println("��ѯ��������ȷ��");
//        }

        //�Ż��棬�����е�bug���Ⱥ�������
/*        do {
            if (test == -1) {
                System.out.println("�Բ���������Ҫ��ѯ���ַ������������С�"+"\n"+"���Ƿ�Ҫ���������ѯ��");
                Scanner sc = new Scanner(System.in);
                char isNext = sc.next().charAt(0);
                if ('n' == isNext) {
                    break;
                }else if ('y' == isNext) {
                    hwA02.find(testArr);
                }else {
                    System.out.println("������y����n");
                }
            }else {
                System.out.println("�鵽��");
                break;
            }
        }while (test != -2);*/
        //�ڶ���ֱ�ӵ����ڲ��෽����д��
//        System.out.println(new HomeWork03().new A02().find(testArr));

        //���Զ�̬
//        PolymExercise pe = new sonPolymExercise();
//        pe.inherit();
//        pe.close();
//        pe.polym();
//        sonPolymExercise spe = (sonPolymExercise) new PolymExercise();//����ʾ���������ᱨClassCastException����ת������
////        sonPolymExercise spe = (sonPolymExercise) pe;//�����Ҫǿ��ת����Ӧ��ǿ��ת������Ķ���
//        spe.polym();
//        spe.inherit();
//        spe.close();

//       homewor03��ʵ��  3
//        System.out.println(new HomeWork03().new Book().updatePrice(550));

//       homewor03��ʵ��  4
//        int[] oldArray = {1,3,5,7,9};
//        HomeWork03.A03 hwA03 = new HomeWork03().new A03();
//        int[] newArray = hwA03.copyArr(oldArray);
//        for (int i : newArray) {
//            System.out.print(i+"\t");
//        }

//       homewor03��ʵ��  5
//        System.out.println(new HomeWork03().new Circle().getCircum(2));
//        System.out.println(new HomeWork03().new Circle().getCircular(4));

//            HomeWork03.Circle hw = new HomeWork03().new Circle();
//            hw.setRadius(4);
//            System.out.println(hw.getCircular());

//       homewor03��ʵ��  6
//        System.out.println(new HomeWork03().new Cale().getMul(2, 3));
//        System.out.println(new HomeWork03().new Cale().getSub(4.5, 5));
//        System.out.println(new HomeWork03().new Cale().getSum(5, 6));
//        System.out.println(new HomeWork03().new Cale().getDiv(1,9));

//       homewor03��ʵ��  7
//        HomeWork03.Dog hwDog = new HomeWork03().new Dog();
//        hwDog.show("С��","��ɫ",1);

//       homewor03��ʵ��  8
//        new HomeWork03.Test().count1();//10
//        HomeWork03.Test t1 = new HomeWork03.Test();
//        t1.count2();//9
//        t1.count2();//10

//       homewor03��ʵ��  9
//        HomeWork03.Music hwMusic = new HomeWork03().new Music();
//        hwMusic.getInfo("�����",250);
//        hwMusic.play();

//       homewor03��ʵ��  10
//        HomeWork03.Demo d1 = new HomeWork03().new Demo();
//        HomeWork03.Demo d2 = d1;
//        d2.m();
//        System.out.println(d1.i);
//        System.out.println(d2.i);

//       homewor03��ʵ��  11
//        HomeWork03 hw = new HomeWork03();
//        System.out.println(hw.method(hw.method(10.0,20.0),100));

//       homewor03��ʵ��  12
//        HomeWork03.Employee hw = new HomeWork03().new Employee("�����",'��',20,"����Ա",1000);

//       homewor03��ʵ��  13
//            HomeWork03.Circle2 hwC2 = new HomeWork03().new Circle2();
//            HomeWork03.PassObject hwPO = new HomeWork03().new PassObject();
//            hwPO.printAreas(hwC2,10);

//       homewor03��ʵ��  14
//            Class c = Class.forName("JavaBasics_Low.HomeWork03$Person$Computer");//��ȡ�ڲ���
//            HomeWork03.Person.Computer computer = new HomeWork03().new Person().new Computer();
//            HomeWork03.Person tom = new HomeWork03().new Person();
////            tom.fingerGuessGame(tom.getCloth(),computer);
//            for (int i = 0; i < 3; i++) {
//                tom.fingerGuessGame(tom.getCloth(),computer);
//            }
//            System.out.println("��һ��Ӯ��" + tom.winTimes + "��");
//            System.out.println("��һ������" + tom.lostTimes + "��");
//            System.out.println("��һ��ƽ��" + tom.sameTimes + "��");



    }
}
//����ͬ���е���
//class study {
//    public void daka() {
//        System.out.println("�Σ���");
//    }
//}

