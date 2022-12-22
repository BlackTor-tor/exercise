package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:40
 * @注释  交通工具接口
 */
public interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("马儿在地上跑");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("船在水里行");
    }
}

class Airplane implements Vehicles {
    @Override
    public void work() {
        System.out.println("飞机在天上飞");
    }
}