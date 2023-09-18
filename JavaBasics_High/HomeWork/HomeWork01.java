package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/6 20:18
 * @注释
 */
public class HomeWork01 {
/*
一、1.试写出以下代码的执行结果。
     C c =new C();
     C c1=new C(100);
     System.out.println(c);//9.0,red
     System.out.println(c1);//100.0,red
     -------------------------------------------------
     class C {
         double price=10;
         static String color="white";//静态属性，在new之前就会进行类加载完成初始化
         public String toString() { return price +"\t" + color; }
         public C { this.price=9;this.color= "red"; }//把10改成了9，把静态属性的white修改成了red
         public C(double price) { this.price=price; }//有参构造，传入了100，改成了100，静态属性被改成了red，
                                                                                 并且再次new是不加载的，只有一次生命周期，所以color还是red
 */

/*二、
    1、在Frock类中声明私有的静态属性currentNum[int类型]，初始值为100000，作为衣服出厂的序列号起始值。
    2、声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，
     将currentNum增加100，并作为返回值。
    3、在TestFrock类的main方法中，分两次调用getNextNum方法，获取序列号并打印输出
    4、在Frock类中声明serialNumber(序列号)属性，并提供对应的get方法;
    5、在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号，赋给serialNumber属性
    6、在TestFrock类的main方法中，分别创建三个Frock 对象，并打印三个对象的序列号，验证是否为按100递增。
 */

/*
三、按要求实现下列问题:
            1.动物类Animal包含了抽象方法 shout();
            2.Cat类继承了Animal，并实现方法shout，打印“猫会喵喵叫“
            3.Dog类继承了Animal，并实现方法shout，打印”狗会汪汪叫”
            4.在测试类中实例化对象Animal cat =new Cat0并调用cat的shout方法
            5.在测试类中实例化对象Animal dog=new Dog(),并调用dog的shout方法
*/

/*
四、
    1.计算器接口具有work方法，功能是运算，有一个手机类Cellphone，定义方法testWork测试计算功能，
    调用计算接口的work方法。
    2.要求调用CellPhone对象的testWork方法，使用上匿名内部类
*/

/*
五、
    1.编一个类A，在类中定义局部内部类B，B中有一个私有final常量name，有一个方法show()打印常量name。
    进行测试
    2.进阶:A中也定义一个私有的变量name.在show方法中打印测试
*/

/*
六、
    1.有一个交通工具接口类Vehicles，有work方法
    2.有Horse类和Boat类分别实现Vehicles
    3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
    5.实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具,遇到大河时用Boat作为交通工具
*/

/*
七、
    有一个Car类，有属性temperature (温度)，车内有Air (空调)类，有吹风的功能flow,Air会监视车内的温度，
    如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之间则关掉空调。实例化具有不同温度的Car对象，
    调用空调的flow方法，测试空调吹的风是否正确，//体现 类与类的包含关系的案例 类(内部类[成员内部类])
*/

/*
 八、
    1.创建一个Color枚举类
    2.有RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对象;
    3.Color有三个属性redValue，greenValue，blueValue
    4.创建构造方法，参数包括这三个属性
    5.每个枚举值都要给这三个属性赋值，三个属性对应的值分别是
    6.red: 255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
    7.定义接口，里面有方法show，要求Color实现该接口
    8.show方法中显示三属性的值
    9.将枚举对象在switch语句中匹配使用
*/

    public static void main(String[] args) {
        //一、第一题实例
//        C c =new C();
//        C c1=new C(100);
//        System.out.println(c);//9.0,red
//        System.out.println(c1);//100.0,red

        //二、第二题实例
//        //3、在TestFrock类(HomeWork01)的main方法中，分两次调用getNextNum方法，获取序列号并打印输出
//        System.out.println(Frock.getNextNum());
//        System.out.println(Frock.getNextNum());
//        //6、在TestFrock类(HomeWork01)的main方法中，分别创建三个Frock 对象，并打印三个对象的序列号，验证是否为按100递增。
//        Frock frock1 = new Frock();
//        Frock frock2 = new Frock();
//        Frock frock3 = new Frock();
//        System.out.println(frock1.getSerialNumber());
//        System.out.println(frock2.getSerialNumber());
//        System.out.println(frock3.getSerialNumber());

        //三、第三题实例
//        Animal cat = new Cat();
//        cat.shout();

        //四、第四题实例
//        Cellphone cellphone = new Cellphone();
//        cellphone.testWork(new Calculator() {
//            @Override
//            public int work(int num1, int num2) {
//                return num1 + num2;
//            }
//        }, 10, 20);
//        cellphone.testWork(new Calculator() {
//            @Override
//            public int work(int num1, int num2) {
//                return num1 * num2;
//            }
//        }, 10, 20);

        //五、第五题实例
//        A a = new A();
//        a.show();
//    }

        //六、第六题示例
//        Person tangsen = new Person("唐僧", new Horse());
//        tangsen.fly();
//        tangsen.land(tangsen);
//        tangsen.swim();
//        Person bajie = new Person("八戒",new Boat());
//        bajie.fly();
//        bajie.land(bajie);
//        bajie.swim();

        //七、第七题实例
//        Car car1 = new Car(30.0);
//        Car car2 = new Car(50.0);
//        Car car3 = new Car(-30.0);
//        car1.new Air().monitor();
//        car2.new Air().monitor();
//        car3.new Air().monitor();

        //八、第八题实例
        //用switch来查找枚举对象值
//        Color black = Color.BLACK;
//        Color blue = Color.BLUE;
//        Color red = Color.RED;
//        Color green = Color.GREEN;
//        Color yellow = Color.YELLOW;
//        Color gary = GAXY;
//        black.show();
//        blue.show();
//        red.show();
//        green.show();
//        yellow.show();
        //在switch中放入创建的枚举对象，每个case后面写上枚举类中定义的枚举对象
//        switch (gary) {
//            case BLACK :
//                System.out.println("黑色");
//                break;
//            case RED :
//                System.out.println("红色");
//                break;
//            case BLUE :
//                System.out.println("蓝色");
//                break;
//            case GREEN :
//                System.out.println("绿色");
//                break;
//            case YELLOW :
//                System.out.println("黄色");
//                break;
//            default :
//                System.out.println("没有这个颜色");
//        }
    }
}

