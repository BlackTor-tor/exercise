package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/4/2 12:55
 * @注释 装箱和拆箱
 */

public class PackClass {
    int number1;
    int number2;
    public Integer inPack() {//装包
    //1. 手动装箱和拆箱 --jdk5以前有两种方法把一个数字变成包装类
    number1 = 100;
//    Integer integer1 = new Integer(number1);
    Integer integer2 = Integer.valueOf(number1);
//    return integer1;//100
    return integer2;
    }

    public int outPack() {//拆包
    //2. 手动拆箱
    return inPack().intValue();//100
    }

    //JDK5以后可以实现自动装/拆箱
    //3. 自动装箱
    public Integer inPack2() {
        //直接把一个int类型的数字赋值给对应的包装类Integer
        Integer integer3 = 200;//底层调用了integer.valueof(int number)的方法
        return integer3;
    }

    //4. 自动拆箱
    public int outPack2() {
        //直接把一个包装类Integer赋值给int
        int number3 = inPack2();//底层调用的是intValue()方法
        return number3;
    }


}
