package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/5 12:13
 * @ע�� ö������ϰ
 */
@SuppressWarnings("all")
public enum Week {
    MONDAY("����һ") , TUESDAY("���ڶ�"), WEDNESDAY("������"), THURSDAY("������"),
    FRIDAY("������"), SATURDAY("������"), SUNDAY("������");
    private String day;
   private Week(String day) {//1�������вι���
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }

    public static void show() {
        Week[] weeks = Week.values();//�õ�ö����Ķ��󣬴������������
        for (Week week : weeks) {//ȡ��ÿ��ö�ٶ���
            System.out.println(week);
        }
    }
}
