package TestRun;

import javaBasics_High.InnerClass;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/6/22 12:47
 * @注释 java高级部分测试类
 */
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
//        System.out.println(StaticExercise.s);

        //Single的实例
//        Single.Single_Hunger();
//        Single.Single_Lazy();

        //Template的实例
//        new A().print();
//        new B().print();

        //Implements的实例
//        new Implements();

        //InnerClass的实例
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.toString());
        System.out.println(innerClass.hashCode());
        System.out.println(innerClass);

    }
}

