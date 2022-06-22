package JavaBasics_Low;

public class Constructor {
    String name = "小萝莉";//常量池里有个小萝莉的值
    /*
    Constructor() {//java默认的构造器被下面的覆盖了
    }
    * */

    /*说明：构造器不可被对象访问到，也就是说，无法使用对象去调用构造器方法，只能通过new的时候初始化类
            /*
        分析以下代码：
         Constructor c1 = new Constructor();//输出：构造器执行了。
        System.out.println("1" + c1.name);//女神
        c1.name = "御姐";
        System.out.println("2" + c1.name);//御姐

        1、当”new Constructor()”的时候，构造器就执行了，然后把name的值变成女神。
        所以“1+c1.name”是女神，构造方法把类的初始化属性name给覆盖了，如果把“name="女神"”注释掉，那么”1+c1.name“就是小萝莉
        2、当“c1.name="御姐"”代码执行时，又把name的值改成了御姐，所以2+c1.name等于御姐。
        * */
    public Constructor() {//无参构造器
        System.out.println("构造器执行了。");
        name = "女神";//根据类中name属性的地址，找到常量池的女神的值，把女神赋值给name，小萝莉这个值无对象访问，被回收。
    }

    public Constructor(int age,int height,int weight) {//有参构造器
//        age = 20;
        System.out.println(age);
//        height = 180;
        System.out.println(height);
//        weight = 60;
        System.out.println(weight);
    }
}
