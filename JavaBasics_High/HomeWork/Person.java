package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:49
 * @注释
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person() {
        super();
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void land(Person person) {
        try {
            //如果vehicles不是null并且不是一匹马，那么就得到一匹马
            if (!(vehicles instanceof Horse)) {
                vehicles = VehiclesBean.getHorse(person);
                vehicles.work();
            }
        }catch (NullPointerException e) {
            System.out.println("你不是唐僧，没有马，自己走吧");
        }
    }
    public void swim() {
        //如果vehicles不是null并且不是一个船，那么就得到一艘船
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesBean.getBoat();
            vehicles.work();
        }
    }
    public void fly() {
        //如果vehicles不是null并且不是一个飞机，那么就得到一架飞机
        if (!(vehicles instanceof Airplane)) {
            vehicles = VehiclesBean.getAirplane();
            vehicles.work();
        }
    }
}
