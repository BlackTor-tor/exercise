package TestRun;

import java.lang.reflect.InvocationTargetException;

public class JavaBasics_Low_Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //ForExercise.java的实例
//        new ForExercise()..ForExercise();

        //WhileExercise.java的实例
//        new WhileExercise().WhileExercise();

        //ManyForExercise.java的实例
//        new ManyForExercise().manyForExercise();

        //PrintStar.java的实例
//            new TeacherPrintStar().printStar();
//            new MyPrintStar().myPrintStar();

        //ArrayExercise的实例
//        new ArrayExercise().arrayReduce();

        //HomeWork01的实例
//        new HomeWork01().homeWork01();

        //HomeWork02  7的实例
/*        int[] testArr = {100, 10, 55, 8};
        new HomeWork02().bubArr(testArr);
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + "\t");
        }*/

        //Method的实例
//        new Method().printHeart(20,20,"*");

        //MethodExercise的实例
//        new MethodExercise().m1();
//        new MethodExercise().m2();

        //RecursionExercise的实例
//        System.out.println(new RecursionExercise().factorial(4));
//        RecursionExercise RE = new RecursionExercise();
//        System.out.println(RE.monkeyEatPeach(1));
//        RE.eightQueen();

        //Calculator的实例
//        System.out.println(new Calculator().add(1.5,5.0));

        //Constructor的实例
//        Constructor constructor = new Constructor();//输出：构造器执行了。
//        System.out.println("1" + c1.name);//女神
//        Constructor c2 = new Constructor(20,150,45);

//       homewor03的实例  1
//        double[] testArrayMax = {10.0,3.0,100.0,500.0};
//        System.out.println(new HomeWork03.A01().max(testArrayMax));

//       homewor03的实例  2
        //第一种创建内部类对象实例化的写法
//        String[] testArr = {"a","black","blacktor","tor"};
//        HomeWork03.A02 hwA02 = new HomeWork03().new A02();
//        int test = hwA02.find(testArr);
//        if (test != -1) {
//            System.out.println("查到了，存在");
//        }else {
//            System.out.println("查询不到，请确认");
//        }

        //优化版，代码有点bug，等后续处理
/*        do {
            if (test == -1) {
                System.out.println("对不起，您输入要查询的字符不存在数组中。"+"\n"+"您是否要重新输入查询？");
                Scanner sc = new Scanner(System.in);
                char isNext = sc.next().charAt(0);
                if ('n' == isNext) {
                    break;
                }else if ('y' == isNext) {
                    hwA02.find(testArr);
                }else {
                    System.out.println("请输入y或者n");
                }
            }else {
                System.out.println("查到了");
                break;
            }
        }while (test != -2);*/
        //第二种直接调用内部类方法的写法
//        System.out.println(new HomeWork03().new A02().find(testArr));

        //测试多态
//        PolymExercise pe = new sonPolymExercise();
//        pe.inherit();
//        pe.close();
//        pe.polym();
//        sonPolymExercise spe = (sonPolymExercise) new PolymExercise();//错误示范，这样会报ClassCastException类型转换错误
////        sonPolymExercise spe = (sonPolymExercise) pe;//如果需要强制转换，应当强制转换父类的对象
//        spe.polym();
//        spe.inherit();
//        spe.close();

//       homewor03的实例  3
//        System.out.println(new HomeWork03().new Book().updatePrice(550));

//       homewor03的实例  4
//        int[] oldArray = {1,3,5,7,9};
//        HomeWork03.A03 hwA03 = new HomeWork03().new A03();
//        int[] newArray = hwA03.copyArr(oldArray);
//        for (int i : newArray) {
//            System.out.print(i+"\t");
//        }

//       homewor03的实例  5
//        System.out.println(new HomeWork03().new Circle().getCircum(2));
//        System.out.println(new HomeWork03().new Circle().getCircular(4));

//            HomeWork03.Circle hw = new HomeWork03().new Circle();
//            hw.setRadius(4);
//            System.out.println(hw.getCircular());

//       homewor03的实例  6
//        System.out.println(new HomeWork03().new Cale().getMul(2, 3));
//        System.out.println(new HomeWork03().new Cale().getSub(4.5, 5));
//        System.out.println(new HomeWork03().new Cale().getSum(5, 6));
//        System.out.println(new HomeWork03().new Cale().getDiv(1,9));

//       homewor03的实例  7
//        HomeWork03.Dog hwDog = new HomeWork03().new Dog();
//        hwDog.show("小白","白色",1);

//       homewor03的实例  8
//        new HomeWork03.Test().count1();//10
//        HomeWork03.Test t1 = new HomeWork03.Test();
//        t1.count2();//9
//        t1.count2();//10

//       homewor03的实例  9
//        HomeWork03.Music hwMusic = new HomeWork03().new Music();
//        hwMusic.getInfo("龙卷风",250);
//        hwMusic.play();

//       homewor03的实例  10
//        HomeWork03.Demo d1 = new HomeWork03().new Demo();
//        HomeWork03.Demo d2 = d1;
//        d2.m();
//        System.out.println(d1.i);
//        System.out.println(d2.i);

//       homewor03的实例  11
//        HomeWork03 hw = new HomeWork03();
//        System.out.println(hw.method(hw.method(10.0,20.0),100));

//       homewor03的实例  12
//        HomeWork03.Employee hw = new HomeWork03().new Employee("黑洋葱",'男',20,"程序员",1000);

//       homewor03的实例  13
//            HomeWork03.Circle2 hwC2 = new HomeWork03().new Circle2();
//            HomeWork03.PassObject hwPO = new HomeWork03().new PassObject();
//            hwPO.printAreas(hwC2,10);

//       homewor03的实例  14
//            Class c = Class.forName("JavaBasics_Low.HomeWork03$Person$Computer");//获取内部类
//            HomeWork03.Person.Computer computer = new HomeWork03().new Person().new Computer();
//            HomeWork03.Person tom = new HomeWork03().new Person();
////            tom.fingerGuessGame(tom.getCloth(),computer);
//            for (int i = 0; i < 3; i++) {
//                tom.fingerGuessGame(tom.getCloth(),computer);
//            }
//            System.out.println("你一共赢了" + tom.winTimes + "次");
//            System.out.println("你一共输了" + tom.lostTimes + "次");
//            System.out.println("你一共平手" + tom.sameTimes + "次");



    }
}
//测试同类中的类
//class study {
//    public void daka() {
//        System.out.println("滴，打卡");
//    }
//}

