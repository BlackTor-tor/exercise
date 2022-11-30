package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/24 9:58
 * @注释  静态相关
 */
public class StaticExercise {
    //静态代码块
    static {
        System.out.println("我是静态代码块");
    }
    //静态属性
    public static int s = helloStatic();
    public static double d = 5.0;
    //静态方法
    private static int helloStatic() {
        System.out.println("我是静态方法");
        return 1;
    }
    //内部静态类
    static class A {
        public A() {
            System.out.println("我是内部静态类的构造器");
        }
    }

    public void noStatic() {
        System.out.println(d);
    }

    public StaticExercise() {
        System.out.println("静态类的构造器");
    }

}
