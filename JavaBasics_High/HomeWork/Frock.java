package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/6 21:52
 * @注释
 */
public class Frock {
    //1、在Frock类中声明私有的静态属性currentNum[int类型]，初始值为100000，作为衣服出厂的序列号起始值。
    private static int currentNum = 100000;
    // 4、在Frock类中声明serialNumber(序列号)属性，并提供对应的get方法;
    private int serialNumber;//序列号
    //2、声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，
    //     将currentNum增加100，并作为返回值。
    public static int getNextNum() {
       return currentNum += 100;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    //5、在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号，赋给serialNumber属性
    Frock() {
        serialNumber = getNextNum();
    }
}
