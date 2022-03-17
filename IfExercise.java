import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class IfExercise {

    private static int adultPrice = 60 ;
    private static int childPrice = adultPrice / 2;
    private static int oldPrice = adultPrice / 3;
    private static int month = 3;
    /*public static void main(String[] args) {
                        *//*需求：
                        出票系统：根据淡旺季的月份和年龄，打印票价
                        4—10 旺季：
                                 成人（18-60）：60
                                 儿童（<18）:半价
                                 老人（>60）:1/3
                            淡季：
                                 成人：40
                                 其他：20

                          需求分析：
                          1.需要使用嵌套分支结构，旺季和淡季
                          2、根据不同季节实现出售不同的票价

                        *//*

                            //创建Scanner对象,import java.util.Scanner;
                            Scanner sc = new Scanner(System.in);

                            //接收用户输入的年龄
                            System.out.println("请收入年龄：");
                            try {
                                int age = sc.nextInt();
                                //导入时间对象，获取当前月份时间，并转为指定月份格式
//                                SimpleDateFormat SDF = new SimpleDateFormat("MM");
//                                Date date = new Date(System.currentTimeMillis());
//                                int month = Integer.parseInt(SDF.format(date));

                                //判断淡季还是旺季
                                if (month >= 4 && month <= 10) {
                                    //判断用户输入的年龄
                                    if (age >= 18 && age <= 60) {

                                        int adultPrice = 60;
                                        System.out.println("现在是旺季，您是成年人，票价是：" + adultPrice + "元");

                                    }else if (age < 18 && age >= 1) {

                                        int childPrice = adultPrice / 2;
                                        System.out.println("现在是旺季，您是儿童，票价是：" + childPrice + "元");

                                        //年龄不超过120极限
                                    }else if (age > 60 && age <= 120) {

                                        int oldPrice = adultPrice / 3;
                                        System.out.println("现在是旺季，您是老人，票价是：" + oldPrice + "元");

                                    }else {

                                        System.out.println("您输入的年龄有误，请输入1-120整数");

                                    }
                                }else if(month < 4 || month > 10) {
                                    if (age >= 18 && age <= 60) {

                                        int adultPrice = 40;
                                        System.out.println("现在是淡季，您是成年人，票价是：" + adultPrice + "元");

                                    }else if (age < 18 && age >= 1) {

                                        int childPrice = 20;
                                        System.out.println("现在是淡季，您是儿童，票价是：" + childPrice + "元");

                                    }else if (age > 60 && age <= 120) {

                                        int oldPrice = 20;
                                        System.out.println("现在是淡季，您是老人，票价是：" + oldPrice + "元");

                                    }else {

                                        System.out.println("您输入的年龄有误，请输入1-120整数");

                                    }
                                }
                            }catch (InputMismatchException IME) {
                                System.out.println("对不起，您输入的类型不匹配。请重新输入1-120的整数");
                            }

    }*/
}
