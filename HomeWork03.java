public class HomeWork03 {
    /*

    2、编写类A02，定义方法find，实现查找某字符串是否在数组中，并返回索引，如果找不到，返回-1

    3、编写类book，定义方法updatePrice，实现更改某本书的价格。具体：如果价格>150,则更改为150，如果价格>100，更改为100，否则不变

    4、编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样

    5、定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法

    6、编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）
    并创建两个对象，分别测试

    7、设计一个dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。并创建对象，进行测试、

    8、给定一个java程序的代码如下所示，则编译运行后，输出结果是 ：
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
            t1.count1();
            t1.count2();
        }
    }

    9、定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返回本身属性信息的功能方法getInfo

    10、试写出以下代码的运行结果：
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

    11、在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式，
    调用语句为：System.out.println(method(method(10.0,20.0),100))

    12、创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），提供3个构造方法，可以初始化：
    （1）名字，性别，年龄，职位，薪水
    （2）名字，性别，年龄
    （3）职位，薪水
    要求充分复用构造器

    13、将对象作为参数传递给方法
    题目要求：
    （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积
    （2）定义一个类PassObject，在类中定义一个方法printArea()，该方法的定义如下：
        public void printAreas(Circle c,int times)      //方法签名/声明
    （3）在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
        例如：times为5时，则输出半径1，2，3，4，5，以及对应的圆面积。
    （4）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示

    14、有个人Tom设计他的成员变量，成员方法，可以电脑猜拳，电脑每次都会随机生成0，1，2
    0表示石头，1表示剪刀，2表示布，并要可以显示Tom的输赢次数
    * */

    /*
    * 1、编写类A01，定义方法max，实现求某个double数组的最大值，并返回。
    * */
    public static class A01 {
        public double max(double[] array) {
            double max = 0;
            for (int  i = 0; i < array.length - 1;i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    //比较数组中元素的大小，返回最大的那个值
                    if (array[j] > array[j+1]) {
                        max = array[j];
                    }

            }

            }
            return max;
        }

    }


}
