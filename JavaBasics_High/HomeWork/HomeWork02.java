package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/3/4 9:18
 * @注释
 */
public class HomeWork02 {
    /*
     * 2.说出以下代码是否会发生异常，如果会，是哪种异常? 如果不会，则打印结果是什么？
     * */
    public static void main(String[] args) {
        if (args[4].equals("john")) {//可能发生NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
            Object o = args[2];//String > Object子类转父类
            Integer i = (Integer)o;//向下转型，把父类赋给子类，会报错。
        }
    }

    /*3.写出程序结果:BCD
     */
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

//    public static void main(String[] args) {///main方法
//        try {
//            func();
//            System.out.println("A"):
//        } catch (Exception e) {
//            System.out.println("c");
//        }
//        System.out.println("D");
//    }

    /*4.写出程序结果:BCD
        */
    public static void showExce() throws Exception {
        throw new Exception();
    }
//    public static void main(String[] args) {
//        try {
//            showExce();
//            System.out.println("A");
//        }
//        catch(Exception e) {
//            System.out.println("B");
//        }
//        finally {
//            System.out.println("C");
//        }
//            System.out.println("D");

}