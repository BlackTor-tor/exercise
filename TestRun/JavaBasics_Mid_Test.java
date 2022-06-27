package TestRun;

import JavaBasics_Mid.HomeWork;

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
//        JavaBasics_Mid_Test test = new JavaBasics_Mid_Test();
//        test.InnerKungfu();

        //HomeWork的实例  1  自己写的
/*        HomeWork.Person zhangsan = new HomeWork().new Person("张三", 20, "卖鱼");
        HomeWork.Person lisi = new HomeWork().new Person("李四",22, "打猎");
        HomeWork.Person wangwu = new HomeWork().new Person("王五",30,"砍柴");
        HomeWork.Person zhaoliu = new HomeWork().new Person("赵六",50,"屠夫");
        int[] pAge = {zhangsan.getAge(),lisi.getAge(),wangwu.getAge(), zhaoliu.getAge()};
        System.out.println("========年龄排序前======");
        for (int i = 0; i < pAge.length; i++) {
            System.out.print(pAge[i] + "\t");
        }
        System.out.println("\n========年龄排序后（从大到小）======");
        zhangsan.maxAge1(pAge);
        for (int i = 0; i < pAge.length; i++) {
            System.out.print(pAge[i] + "\t");
        }*/

        //HomeWork的实例  1  韩老师版本
/*        HomeWork.Person[] people = new HomeWork.Person[4];
        people[0] = new HomeWork().new Person("张三", 20, "卖鱼");
        people[1] = new HomeWork().new Person("李四",22, "打猎");
        people[2] = new HomeWork().new Person("王五",30,"砍柴");
        people[3] = new HomeWork().new Person("赵六",50,"屠夫");

        System.out.println("\n========年龄排序前======");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("\n========年龄排序后（从大到小）======");
        zhangsan.maxAge2(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }*/

        //HomeWork的实例 3
        HomeWork.Teacher zhang = new HomeWork().new Instructor("张老师",22,"讲师",3000,1.1);
        HomeWork.Teacher li = new HomeWork().new ViceProfessor("李老师",30,"副教授",5000,1.2);
        HomeWork.Teacher wang = new HomeWork().new Professor("王老师",40,"教授",10000,1.3);
        System.out.println(zhang.introduce());
        System.out.println(li.introduce());
        System.out.println(wang.introduce());
    }
}


