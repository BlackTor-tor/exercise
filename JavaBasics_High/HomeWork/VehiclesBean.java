package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:45
 * @ע�� ��ͨ���߹�����
 */
public class VehiclesBean {
    //�����ͬһƥ���ɻ�Ҳ��ͬһ���ɻ������Բ��ö���ʽֱ�����������Դ�����
    private static Horse horse = new Horse();
    private static Airplane airplane = new Airplane();

    public static Boat getBoat() {
        return new Boat();
    }

    public static Horse getHorse(Person person) {
        //�ж�һ���ǲ�����ɮ
        if (person.getName().equals( "��ɮ")) {
            return horse;
        }
        else {
            return null;
        }
    }

    public static Airplane getAirplane() {
        return airplane;
    }

    private VehiclesBean() {
    }
}
