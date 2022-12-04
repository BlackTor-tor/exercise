package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/1 10:46
 * @注释 枚举类练习
 */
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
    public String toString() {
        return super.toString() +
                "：id=" + id +
                ", phone=" + phone;
    }
}
