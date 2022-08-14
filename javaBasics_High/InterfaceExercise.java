package javaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/8/14 21:24
 * @注释
 */
public interface InterfaceExercise {
    //接口的属性
    String name = "接口";

    default public void commonMethod() {
        System.out.println("接口的普通方法");
    }

    public static void staticMethod() {
        System.out.println("接口的静态方法");
    }

    abstract public void abstractMethod();//abstract可以省略

    abstract public void abstractMethod2();
}
