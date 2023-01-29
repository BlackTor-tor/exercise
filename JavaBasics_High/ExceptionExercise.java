package JavaBasics_High;
@SuppressWarnings("all")
public class ExceptionExercise {
    public static int i = 1;
    public static int testException() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;//算数异常
            String name = null;
            if (name.equals("tor")) {//空指针异常
            }else {
                return i+1;
            }
        }catch (ArithmeticException AE) {
            System.out.println("算数异常：" + AE.getMessage());
            return i+2;//先执行i+2这个操作，但是暂时不返回，等finally语句执行完再返回i的值
        }catch (NullPointerException NE) {
            System.out.println("空指针异常：" + NE.getMessage());
            return i+3;
        }catch (Exception E) {
            System.out.println("其它异常：" + E.getMessage());
            return i+4;
        }
        finally {
            System.out.println("执行了finally代码");
            return i+5;//如果,finally里有return，则try-catch外不能有代码存在，表示方法已经结束。
                       //另外，如果finally里面有return，则不会执行捕获异常catch块中的return，优先执行finally中的
        }
//        System.out.println("程序继续……");
//        return 0;
    }

}
