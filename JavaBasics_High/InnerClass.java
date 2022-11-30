package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/13 16:20
 * @注释 内部类练习
 */
public class InnerClass {//外部其他类

    //外部类和内部类的应用
    public void innerClassTest() {
        //1、方法一：创建外部类对象，通过调用外部类中访问内部类方法的方法去访问内部类的方法，
        // 或者访问外部类(在权限范围内)自己的属性和方法
        OutClass outClass = new OutClass();
        //System.out.println(outClass.name);
//        outClass.test();
//        outClass.outMethod();
        //2、方法二：创建内部类对象，访问自己(在权限范围内)的属性和方法
        OutClass.InClass inClass = outClass.new InClass();
        inClass.InnerMethod();
//        System.out.println(inClass.name);
//        System.out.println(outClass);//@14ae5a5
//        System.out.println(inClass);//@7f31245a

        /*
        总结：第一种方法是把对象封装在方法中去访问方法，安全性高。
        但是缺点是不利于维护代码，如果内部类中增加或者修改方法，外部类的方法中也需要去修改。比较繁琐
        第二种方法是用对象实例直接去访问自己的属性和方法，比较灵活，两种方法根据需要去选择。
        */
    }
}

class OutClass {//外部类
    public String name = "洋葱";
    private int outNum = 1;

    public void outMethod() {
        System.out.println("外部类方法");
    }

    public void test() {
        System.out.println("外部类OutClass的test方法");
        InClass inClass = new InClass();
        inClass.InnerMethod();
        inClass.test2();
    }

    private void test2() {
        System.out.println("私有的外部类方法");
    }

    class InClass {//内部类
        public String name = "黑洋葱";
        private int outNum = 100;

        public void InnerMethod() {
            System.out.println("内部类方法");
            System.out.println(outNum);//100
            System.out.println(OutClass.this.outNum);//1
            outMethod();//外部类方法
            OutClass.this.outMethod();//外部类方法
            test();
//            test2();
//            OutClass.this.test2();
            System.out.println(OutClass.this);//引用地址指向了@14ae5a5和System.out.println(outClass)是一致的。说明OutClass.this其实就是外部类的对象在调用
        }

        private void test2() {
            System.out.println("私有的内部类方法");
//            test();//如果外部类和内部类同时存在相同方法名的方法，在内部类中优先调用的是自己的
        }

        public void test() {
            System.out.println("内部类inClass的test方法");
        }
    }
}