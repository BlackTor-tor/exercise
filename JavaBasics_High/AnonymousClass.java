package JavaBasics_High;


/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/28 12:25
 * @注释 匿名内部类练习
 */
public class AnonymousClass {
    /**
     * @Author: tor
     * @Description:  关于继承的匿名内部类
     * @Date: 2022/11/29 10:38
     * @Params: []
     * @Return: void
     **/
    public void AnonymousTest() {

        //方法1
        Father father = new Father() {
            public String name;
        };
        father.test();//如果是继承关系的匿名内部类，必须在父类也定义了相同名字的方法，否则父类的对象无法找到。
                            // 但如果不用对象去调用，可以不需要和父类一样，是否使用对象调用还是匿名调用，取决于是否需要用到这个对象
        //方法2
        new Father() {
            public String name;
            public void test2() {//父类不需要有test2方法
                System.out.println("匿名内部类的test2方法");
            }
        }.test2();
    }
}

class Father {
//    public Father(String name) {
//        System.out.println(name);
//    }
    public void test() {
        System.out.println("父类的test方法");
    }
}
