package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/5 12:13
 * @注释 枚举类练习
 */
@SuppressWarnings("all")
public enum Week {
    MONDAY("星期一") , TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String day;
   private Week(String day) {//1、声明有参构造
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }

    public static void show() {
        Week[] weeks = Week.values();//拿到枚举类的对象，存入对象数组中
        for (Week week : weeks) {//取出每个枚举对象
            System.out.println(week);
        }
    }
}
