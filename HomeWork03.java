import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {
    /*
    * 1、编写类A01，定义方法max，实现求某个double数组的最大值，并返回。
    * */
    public static class A01 {
        public double max(double[] array) {
            double min = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    //比较数组中元素的大小，返回最大的那个值
                    if (array[j] < array[j + 1]) {
                        min = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = min;
                    }
                }
            }
            return array[0];
        }
    }

    /*
    * 2、编写类A02，定义方法find，实现查找某字符串是否在数组中，并返回索引，如果找不到，返回-1
    * */
    public  class A02 {
        public int find(String[] strArray) {
            //创建Scanner输入要查询的字符串
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要查询的字符串：");
            String str = scanner.next();

            //遍历该字符串数组
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].equals(str)) {
                    return i;
                }
            }
            return -1;
        }
    }

        /*
        *    3、编写类book，定义方法updatePrice，实现更改某本书的价格。具体：如果价格>150,则更改为150，如果价格>100，更改为100，否则不变
        *  */
        public class Book {
            public int updatePrice(int price) {
                if (price > 150) {
                    price = 150;
                    return price;
                }else if (price > 100 && price < 150) {
                    price = 100;
                    return price;
                }
                return price;
            }
    }

        /*
        *     4、编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
        * */
        public class A03 {
            public int[] copyArr(int[] array) {
                int[] newArray = new int[array.length];
                for (int i = 0,j = 0; i < array.length; i++,j++) {
                   newArray[j] = array[i];
                }
                System.out.println(array.hashCode());
                array  = newArray;
                System.out.println(array.hashCode());
                return array;
            }
        }

        /*
        *     5、定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
        *   圆周长公式：c=2π·r
        *   圆面积公式：S=π·r?
        * */
            public class Circle1 {
                private double radius;
                public double getRadius() {
                    return radius;
                }

                public void setRadius(double radius) {
                    this.radius = radius;
                }
                public double getCircum() {//求圆周长
                    double c = radius*2*Math.PI;
                    return c;
                }
                public double getCircular() {//求圆面积
                    double s = radius*radius*Math.PI;//1
//                    double s = Math.pow(radius,2)*Math.PI;//2
                    return s;
                }
        }

                /*
                *   6、编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）
    并创建两个对象，分别测试
                *  */
                public class Cale {
                    public double getSum(double num1,double num2) {//求和
                        double sum = num1 + num2;
                        return sum;
                    }
                    public double getSub(double num1,double num2) {//求差
                        double sub = num1 - num2;
                        return sub;
                    }
                    public double getMul(double num1,double num2) {//求乘
                        double mul = num1*num2;
                        return mul;
                    }
                    public double getDiv(double num1,double num2) {//求除
                        if (num1 == 0) {
                            System.out.println("0不能作为除数");
                        }else {
                            double div = num1/ num2;
                            return div;
                        }
                        return -1;
                    }
    }

            /*
             *   7、设计一个dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。并创建对象，进行测试、
             * */
                    public class Dog {
                        private String dogName;
                        private String dogColor;
                        private int dogAge;

                    public void show(String dogName,String dogColor,int dogAge) {
                        System.out.println("狗的名字是：" + (this.dogName = dogName));
                        System.out.println("狗的颜色是：" + (this.dogColor = dogColor));
                        System.out.println("狗的年龄是：" + (this.dogAge = dogAge));
                    }
            }

            /*
            *     8、给定一个java程序的代码如下所示，则编译运行后，输出结果是 ：10,10
                public static class Test {
                    int count = 9;
                    public void count1() {
                        count = 10;
                        System.out.println("count1=" + count);
                    }
                    public void count2() {
                        System.out.println("count1=" + count++);
                    }

                    public static void main(String[] args) {
                        new Test().count1();
                        Test t1 = new Test();
                        t1.count1();//9
                        t1.count2();//10
                    }
            }
            * */
            public static class Test {
                int count = 9;
                public void count1() {
                    count = 10;
                    System.out.println("count1=" + count);
                }
                public void count2() {
                    System.out.println("count1=" + count++);
                }
                }

                /*
                *     9、定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返回本身属性信息的功能方法getInfo
                * */
                    public class Music {
                        private String musicName;
                        private double times;
                        public void play() {
                            System.out.println("开始播放歌曲：" + musicName);
                            if (times > 60) {
                                times /= 60;
                            }
                            BigDecimal bigDecimal =new BigDecimal(times);
                            times = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();//四舍五入
                            System.out.println("音乐时长：" + times+ "分");
                        }
                        public void getInfo(String musicName,int times) {
                            this.musicName = musicName;
                            this.times = times;
                        }
                }

                /*
                *     10、试写出以下代码的运行结果：i=101，j=100，101，101
                     public class Demo {
                            int i = 100;
                            public void m() {
                                int j = i++;
                                System.out.println("i=" + i);
                                System.out.println("j=" + j);
                            }
                        }

                        public class Test {
                            public static void main(String[] args) {
                                Demo d1 = new Demo();
                                Demo d2 = d1;
                                d2.m();
                                System.out.println(d1.i);
                                System.out.println(d2.i);
                            }
                         }
                * */
                    public class Demo {
                    int i = 100;
                    public void m() {
                        int j = i++;
                        System.out.println("i=" + i);
                        System.out.println("j=" + j);
                    }
                }

                /*
                *     11、在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式，
                * 调用语句为：System.out.println(method(method(10.0,20.0),100))
                * */
                    public double method(double d1,double d2) {
                        return d1 + d2;
                    }

                /*
                *     12、创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），提供3个构造方法，可以初始化：
                            （1）名字，性别，年龄，职位，薪水
                            （2）名字，性别，年龄
                            （3）职位，薪水
                            要求充分复用构造器
                * */
                    public class Employee {
                        private String name;
                        private String gender;
                        private int age;
                        private String job;
                        private int salary;

                        public Employee() {
                            System.out.println("无参构造执行了");
                        }
                        public Employee(String name, String gender, int age, String job, int salary) {
                        this.name = name;
                        this.gender = gender;
                        this.age = age;
                        this.job = job;
                        this.salary = salary;
                        System.out.println("有参构造执行了");
                    }
                        public Employee(String name,String gender,int age) {
                        this.name = name;
                        this.gender = gender;
                        this.age = age;
                    }
                        public Employee(String job,int salary) {
                        this.job = job;
                        this.salary = salary;
                    }
                }

                /*
                *     13、将对象作为参数传递给方法
                    题目要求：
                    （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。        ***圆面积公式：S=π·r?
                    （2）定义一个类PassObject，在类中定义一个方法printArea()，该方法的定义如下：
                        public void printAreas(Circle c,int times)      //方法签名/声明
                    （3）在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
                        例如：times为5时，则输出半径1，2，3，4，5，以及对应的圆面积。
                    （4）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示
                * */
                public class Circle2 {
                    private double radius;
                    public double findArea() {
                        return Math.PI*Math.pow(radius,2);
                    }
                }
                public class PassObject {
                    Scanner scanner =new Scanner(System.in);
                    public void printAreas(Circle2 c,int times) {
                        System.out.println("请输入您要查询多少以内的圆面积的整数半径值：");
                        times = scanner.nextInt();
                        System.out.print("Radius" + "\t\t" + "Area" + "\n");
                        double s = 0;
                        for (int i = 0; i < times; i++) {
                            c.radius = i + 1;
                            for (int j = 0; j < times - i; j++) {
                                s = c.findArea();
                            }
                            System.out.println(c.radius + "\t\t\t" + s);
                        }
                    }
                }

                /*
                *
                14、有个人Tom设计他的成员变量，成员方法，可以电脑猜拳，电脑每次都会随机生成0，1，2
                0表示石头，1表示剪刀，2表示布，并要可以显示Tom的输赢次数
                * */
                    public class Person {
                        private  final int stone = 0;//石头
                        private  final int scissor = 1;//剪刀
                        private  final int cloth = 2;//布
                        private String Stone = "石头";
                        private String Scissor = "剪刀";
                        private String Cloth = "布";
                        int winTimes;
                        int lostTimes;
                        int sameTimes;
                    public int getStone() {
                        return stone;
                    }
                    public int getScissor() {
                        return scissor;
                    }
                    public int getCloth() {
                        return cloth;
                    }
                    public  class Computer {
                        int randomGuess() {
                            Random random = new Random();
                            return random.nextInt(3);
                        }
                    }
                    public void fingerGuessGame(int num,Computer computer) {
                        int comTempRecord = computer.randomGuess();//记录电脑的出拳
                        if(num == 0) {
                            if (num <= comTempRecord) {//石头的输赢逻辑
                                if (comTempRecord == num) {
                                    sameTimes++;
                                    System.out.println("不好意思，这把平手，请再战一次!");
                                } else if (comTempRecord == 1) {
                                    winTimes++;
                                    System.out.println("你出的是：" + Stone + "\n" + "电脑出的是：剪刀\t" + "你赢了！");
                                } else {
                                    lostTimes++;
                                    System.out.println("你出的是：" + Stone + "\n" + "电脑出的是：布\t" + "你输了！");
                                }
                            }
                        }else if(num == 1) {
                            if (num <= comTempRecord) {//剪刀的输赢逻辑
                                if (comTempRecord == num) {
                                    sameTimes++;
                                    System.out.println("不好意思，这把平手，请再战一次!");
                                } else {
                                    winTimes++;
                                    System.out.println("你出的是：" + Scissor + "\n" + "电脑出的是：布\t" + "你赢了！");
                                }
                            } else {
                                lostTimes++;
                                System.out.println("你出的是：" + Scissor + "\n" + "电脑出的是：石头\t" + "你输了！");
                            }
                        }else {
                            if (num >= comTempRecord) {//布的输赢逻辑
                                if (comTempRecord == num) {
                                    sameTimes++;
                                    System.out.println("不好意思，这把平手，请再战一次!");
                                } else if (comTempRecord == 1) {
                                    lostTimes++;
                                    System.out.println("你出的是：" + Cloth + "\n" + "电脑出的是：剪刀\t" + "你输了！");
                                }else {
                                    winTimes++;
                                    System.out.println("你出的是：" + Cloth + "\n" + "电脑出的是：石头\t" + "你赢了！");
                                }
                            }
                         }
                        }
                    }

}
