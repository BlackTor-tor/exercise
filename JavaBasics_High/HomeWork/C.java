package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/6 21:51
 * @注释
 */
public class C {
    double price = 10;
    static String color = "white";//静态属性，在new之前就会进行类加载完成初始化

    public String toString() {
        return price + "\t" + color;
    }

    public C() {
        this.price = 9;//把10改成了9，把静态属性的white修改成了red
        this.color = "red";
    }

    public C(double price) {//有参构造，传入了100，改成了100，静态属性被改成了red，
        this.price = price;         // 并且再次new是不加载的，只有一次生命周期，所以color还是red
    }
}
