package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:45
 * @注释 交通工具工厂类
 */
public class VehiclesBean {
    //马就是同一匹马，飞机也是同一个飞机，所以采用饿汉式直接声明成属性创建好
    private static Horse horse = new Horse();
    private static Airplane airplane = new Airplane();

    public static Boat getBoat() {
        return new Boat();
    }

    public static Horse getHorse(Person person) {
        //判断一下是不是唐僧
        if (person.getName().equals( "唐僧")) {
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
