package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/30 16:15
 * @注释
 */
public class ClassLoad {
    public static void main(String[] args) {
        //调用静态的属性或方法会导致类加载，类加载会执行静态代码块的代码，然后才显示调用的结果
//        System.out.println(Father.num);
//        new Father();
//        new Son();
        new Son("张三");
//        Father.fhello();
//        new father();//一旦创建对象，普通代码块和构造器都会随着对象的创建而被调用
//        new Father();

    }
}
class Father {
    public static int num = 1;
    public static void fhello() {
        System.out.println("父类静态方法");
    }
    /*
    1、类什么时候被加载？
    (1)创建对象实例时(new)
    (2)创建子类对象实例，父类也会被加载
    (3)使用类的静态成员时(静态属性，静态方法)
    2、类加载顺序(重要!!!)
     静态代码块 > (如果有调用静态方法或者属性) > 普通代码块 > 父类构造器 > 子类构造器
     有继承关系时，创建子类对象会先加载父类，执行顺序是：
     父类静态代码块 > 子类静态代码快 > 父类普通代码块 > 父类构造器 > 子类普通代码块 > 子类构造器
     */
    {
        System.out.println("父类普通代码块");//每次创建对象都会被调用一次
    }
    static {
        System.out.println("父类静态代码块");
    }

    public Father() {
        System.out.println("父类构造器");//每次创建对象都会被调用一次
    }
}

class Son extends Father {
    public Son() {
        //super();//这里隐藏了一个super()子类创建对象默认会进行初始化父类的构造器
        System.out.println("子类构造器");
    }
    public Son(String name) {
        System.out.println("子类有参构造器");
    }

    static {
        System.out.println("子类静态代码快");
    }
    {
        System.out.println("子类普通代码块");
    }
    public static void shello() {
        System.out.println("子类静态方法");
    }
}
