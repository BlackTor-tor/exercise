package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/21 11:45
 * @注释
 */
public interface Calculator {
    int work(int num1,int num2);
}

class Cellphone{
    public void testWork(Calculator calculator,int num1, int num2) {
        int value = calculator.work(num1, num2);
        System.out.println("结果等于=" + value);
    }

}
