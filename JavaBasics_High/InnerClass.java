package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/11/13 16:20
 * @注释  内部类练习
 */
public class InnerClass {//外部其他类
    //外部类和内部类的应用
    public void innerClassTest() {
        OutClass outClass = new OutClass();
        outClass.Test();
    }
}

class OutClass {//外部类
    private int outNum = 1;
    public void outMethod() {
        System.out.println("外部类方法");
    }
    public void Test() {
        InClass inClass = new InClass();
        inClass.InnerMethod();
    }
    class InClass {//内部类
        private int outNum = 100;
        public void InnerMethod() {
            System.out.println(outNum);//100
            System.out.println(OutClass.this.outNum);//1
            OutClass.this.outMethod();//外部类方法
            System.out.println("内部类方法");
        }
    }
}