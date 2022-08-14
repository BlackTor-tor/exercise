package javaBasics_High.DesignMode;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/8/14 10:47
 * @注释  模板模式，用一个抽象类抽象出子类共有的方法，在该类中声明抽象方法，
 *             在共同的方法中调用抽象方法，具体实现交给子类去做
 */
abstract public class Template {
    public void print() {
        System.out.println(showSelf());
    }
    abstract public String showSelf();
}
