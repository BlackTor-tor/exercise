package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/1 10:46
 * @注释 枚举类练习
 */
@SuppressWarnings("all")
public enum EnumExercise {
    //所有的常量对象必须放在首行
    APPLE(1,"18688885555"),ANDROID(2,"13579246810");
    private int id;
    private String phone;

    EnumExercise(int id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {//如果不重写枚举类的toString方法，就会导致用EnumExercise.常量名输出的是常量名而不是枚举类所对应的对象中的所有属性
        return super.toString() +
                "：id=" + id +
                ", phone=" + phone;
    }
}
