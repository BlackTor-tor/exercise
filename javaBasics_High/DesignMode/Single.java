package javaBasics_High.DesignMode;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/24 10:57
 * @注释  单例模式：整个程序只存在一个对象
 */
public class Single {
    public static void Single_Hunger() {
        //饿汉式
        //只能这样去获取一个单例模式类的对象的实例
        BlackTor_Hunger blackTor_hunger = BlackTor_Hunger.instance();
        System.out.println(blackTor_hunger);
    }
    public static void Single_Lazy() {
        //懒汉式
        BlackTor_Lazy blackTor_lazy = BlackTor_Lazy.instance();
        System.out.println(blackTor_lazy);
    }
}

/**
 * @Author: tor
 * @Description:  单例模式——饿汉式
 *  关于饿汉式的解释：不管你用不用这个类，都会进行实例的创建，造成资源的浪费，线程是安全的。
 * @Date: 2022/7/24 11:18
 * @Params:
 * @Return:
 **/
class BlackTor_Hunger {
    private String name;
    //构造器需要私有化
    private BlackTor_Hunger(String name) {
        this.name = name;
    }
    //对象实例也需要私有化，声明为静态的
    private static BlackTor_Hunger blackTor = new BlackTor_Hunger("黑洋葱饿汉式");
    //最后再提供一个公开的静态的实例对象的方法
    public static BlackTor_Hunger instance() {
        return blackTor;
    }

    @Override
    public String toString() {
        return "BlackTor_Hunger{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * @Author: tor
 * @Description: 单例模式——懒汉式
 * 关于懒汉式的解释：需要用到的时候再通过提供了创建实例的方法去new
 * 这样不会造成资源的浪费，但会有线程不安全的问题，效率低。
 * @Date: 2022/7/24 12:13
 * @Params:
 * @Return:
 **/
class BlackTor_Lazy {
    private String name;
    //静态私有实例对象，先不new
    private static BlackTor_Lazy blackTor_lazy;
    //提供一个公开的静态获取类实例的方法
    public static BlackTor_Lazy instance() {
        if (blackTor_lazy == null) {
            blackTor_lazy = new BlackTor_Lazy("黑洋葱懒汉式");
        }
        return blackTor_lazy;
    }
    private BlackTor_Lazy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BlackTor_Lazy{" +
                "name='" + name + '\'' +
                '}';
    }
}
