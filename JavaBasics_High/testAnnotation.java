package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/9/8 12:36
 * @注释
 */

public class testAnnotation {
    //@Deprecated表示过时的注解，比如版本过渡时用，在同一个类中调用此类方法时会显示删除线，但是在不同类中不会显示
    @Deprecated
    public void haha() {
        System.out.println("哈哈哈哈");
    }
}
class father {
    //@SuppressWarning 注解，忽略某些编译器提示的警告信息
    /**
     * @SuppressWarning 中的属性介绍以及属性说明
     *
     * all，抑制所有警告
     * boxing，抑制与封装/拆装作业相关的警告
     * cast，抑制与强制转型作业相关的警告
     * dep-ann，抑制与淘汰注释相关的警告
     * deprecation，抑制与淘汰的相关警告
     * fallthrough，抑制与switch陈述式中遗漏break相关的警告
     * finally，抑制与未传回finally区块相关的警告
     * hiding，抑制与隐藏变数的区域变数相关的警告
     * incomplete-switch，抑制与switch陈述式(enum case)中遗漏项目相关的警告
     * javadoc，抑制与javadoc相关的警告
     * nls，抑制与非nls字串文字相关的警告
     * null，抑制与空值分析相关的警告
     * rawtypes，抑制与使用raw类型相关的警告
     * resource，抑制与使用Closeable类型的资源相关的警告
     * restriction，抑制与使用不建议或禁止参照相关的警告
     * serial，抑制与可序列化的类别遗漏serialVersionUID栏位相关的警告
     * static-access，抑制与静态存取不正确相关的警告
     * static-method，抑制与可能宣告为static的方法相关的警告
     * super，抑制与置换方法相关但不含super呼叫的警告
     * synthetic-access，抑制与内部类别的存取未最佳化相关的警告
     * sync-override，抑制因为置换同步方法而遗漏同步化的警告
     * unchecked，抑制与未检查的作业相关的警告
     * unqualified-field-access，抑制与栏位存取不合格相关的警告
     * unused，抑制与未用的程式码及停用的程式码相关的警告
     */
    @SuppressWarnings("unused")
    public void run() {
//        new testAnnotation().haha();
        System.out.println("爸爸跑");
    }
}
class son extends father{
    //@Override注解，用于检查子类是否真正的重写了父类方法，如果有则编译通过，没有则编译报错

    /**Override源码解析：
     * @Target(ElementType.METHOD)  //作用位置：方法
     * @Retention(RetentionPolicy.SOURCE)   //作用在源码层面，编译器使用后，直接丢弃这种策略的注释，不会作用到class文件
     * public @interface Override {
     * }
     */
    @Override
    public void run() {
        System.out.println("儿子跑");
    }
    /*@Override //此时，子类在walk()方法上面使用了Override注解，而父类没有这个方法，所以编译会报错
    public void walk() {
    }
     */
}