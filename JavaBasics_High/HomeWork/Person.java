package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:49
 * @ע��
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
            //���vehicles����null���Ҳ���һƥ����ô�͵õ�һƥ��
            if (!(vehicles instanceof Horse)) {
                vehicles = VehiclesBean.getHorse(person);
                vehicles.work();
            }
        }catch (NullPointerException e) {
            System.out.println("�㲻����ɮ��û�����Լ��߰�");
        }
    }
    public void swim() {
        //���vehicles����null���Ҳ���һ��������ô�͵õ�һ�Ҵ�
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesBean.getBoat();
            vehicles.work();
        }
    }
    public void fly() {
        //���vehicles����null���Ҳ���һ���ɻ�����ô�͵õ�һ�ܷɻ�
        if (!(vehicles instanceof Airplane)) {
            vehicles = VehiclesBean.getAirplane();
            vehicles.work();
        }
    }
}
