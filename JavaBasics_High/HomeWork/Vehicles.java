package JavaBasics_High.HomeWork;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/12/19 11:40
 * @ע��  ��ͨ���߽ӿ�
 */
public interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("����ڵ�����");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("����ˮ����");
    }
}

class Airplane implements Vehicles {
    @Override
    public void work() {
        System.out.println("�ɻ������Ϸ�");
    }
}