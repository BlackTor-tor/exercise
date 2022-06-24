package TestRun;

public class JavaBasics_Mid_Test {
    public static void main(String[] args) {
        //Father的实例
        //关于访问权限的问题，如果该类的访问权限不够。又需要调用那个类的方法或者属性时。有两个办法解决：
        // 1、通过创建实例化对象，利用类加载机制调用无参构造器，再调用父类的任意一个方法。
        /*Son son = new Son();
        System.out.println(son.getSword());
        System.out.println(son.num);
        son.InnerKungfu();
        System.out.println("----------------------------------");
        Father father = son;
        System.out.println(father.getSword());
        System.out.println(father.num);//属性看父类
        father.InnerKungfu();*///儿子的剑。说明父类引用首先找的还是儿子的方法，子类有，优先找子类，子类没有，就找父类

        //2、让本类继承父类，再用实例化对象去调用父类中的方法
        JavaBasics_Mid_Test test = new JavaBasics_Mid_Test();
//        test.InnerKungfu();

    }
}


