package TestRun;

import JavaBasics_High.ExceptionExercise;
import JavaBasics_High.PackClass;
import JavaBasics_High.StringClass;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/22 12:47
 * @注释 java高级部分测试类
 */
@SuppressWarnings("all")
public class JavaBasics_High_Test {
    public static void main(String[] args) {
    /**关于args的研究，args是专门用来接收命令行参数的。
     *  如:在一个主类中，运行该程序时： java Test1 365 156 "China"  后面所谓的365 156 "China"就是命令行参数
     *  在控制台编译时，我在电脑控制台输入了命令：java JavaBasics_High_Test aa bb
        根据下面的代码，输出结果为：
        0   aa
        1   bb

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println( i + "\t" + args[i]);
        }
     }*/
//        JavaBasics_High_Test.main(new String[]{"11", "22"});//会报errorOutstanding错误，栈溢出
        //StaticExercise的实例
//        System.out.println(StaticExercise.d);
//        StaticExercise staticExercise = new StaticExercise();

        //Single的实例
//        Single.Single_Hunger();
//        Single.Single_Lazy();

        //Template的实例
//        new A().print();
//        new B().print();

        //Implements的实例
//        new Implements();

        //InnerClass的实例
//        InnerClass innerClass = new InnerClass();
//        innerClass.innerClassTest();

        //AnonymousClass的实例
//        AnonymousClass anonymousClass = new AnonymousClass();
//        anonymousClass.AnonymousTest();

        //Bell的实例
/*        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });*/

        //EnumExercise的实例
        //如果不重写枚举类的toString方法，就会导致用EnumExercise.常量名输出的是常量名
        // 而不是枚举类所对应的对象中的所有属性，下面这行代码打印的结果是APPLE
//        System.out.println(EnumExercise.APPLE);
//        System.out.println(EnumExercise.ANDROID);
//        EnumExercise EE1 = EnumExercise.APPLE;
//        EnumExercise EE2 = EnumExercise.ANDROID;
//        System.out.println(EE1.valueOf("APPL"));//名字不匹配会报java.lang.IllegalArgumentException
//        System.out.println(EE1.valueOf("APPLE"));//用字符串去匹配枚举类中是否存在与字符串所对应的常量名
//        System.out.println(Arrays.toString(EnumExercise.values()));//返回的是一个枚举类数组，可以直接用Array.toString打印数组
//        System.out.println(EE1.ordinal());//打印出APPLE这个常量在枚举类中的定义的次序。输出0
//        System.out.println(EE1.name());//返回对象名，也就是常量名
//        System.out.println(EE1.compareTo(EE2));//EE1的次序是0，EE2是1，所以结果等于-1
//        System.out.println(EE1.equals(EE2));//比较两个枚举对象是否相等

        //Week的实例
//        Week.show();

        //ExceptionExercise的实例
//        System.out.println(ExceptionExercise.testException());

        //CustomException的实例
//        ExceptionExercise.testAge();

        //EcmDef的实例
//        double[] temp = EcmDef.show();
//        for (int i = 0; i < temp.length - 1; i++) {
//            System.out.println(EcmDef.cal(temp[i], temp[i + 1]));
//        }

//        PackClass的实例
//        PackClass packClass = new PackClass();
//        System.out.println(packClass.inPack());
//        System.out.println(packClass.outPack());
//        System.out.println(packClass.inPack2());
//        System.out.println(packClass.outPack2());

        //testAnnotation的实例
//        testAnnotation annotation = new testAnnotation();
//        annotation.haha();

        //StringClass的实例
        StringClass stringClass = new StringClass();
//        stringClass.testString2();
        stringClass.CompareString();


    }
}

