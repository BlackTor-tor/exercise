package JavaBasics_Mid.HouseRentSystem.HouseView;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseService.HouseService;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 9:46
 * @ע��
 */
public class HouseView {
    private boolean isexit = true;//���Ʋ˵�����

    //����Service���󣬵���ҵ���
    HouseService houseService = new HouseService();

    public boolean getIsexit() {
        return isexit;
    }

    public void setIsexit(boolean isexit) {
        this.isexit = isexit;
    }

    /**
     * @Author: tor
     * @Description: ��ʾ���˵�
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showMenu() {
        do {
            System.out.println("------------------���ݳ���ϵͳ���˵�------------------");
            System.out.println("\t\t\t\t1 �� �� �� Դ");
            System.out.println("\t\t\t\t2 �� �� �� �� �� Ϣ");
            System.out.println("\t\t\t\t3 ɾ �� �� �� �� Ϣ");
            System.out.println("\t\t\t\t4 �� �� �� �� �� Ϣ");
            System.out.println("\t\t\t\t5 �� �� �� ��");
            System.out.println("\t\t\t\t6 ��         ��");
            System.out.println("---------------------------------------------------------");
            System.out.print("��������Ҫ����Ĳ˵�����(1-6)��");
            switch (Utool.readMenuSelection()) {
                case '1':
                    showHouseList();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delMenu();
                    break;
                case '4':
                    updateMenu();
                    break;
                case '5':
                    showHouse();
                    break;
                case '6':
                    houseService.exit(this);
                    break;
            }
        } while (isexit);
    }

    /**
     * @Author: tor
     * @Description: 1 ������Դ�˵�
     * @Date: 2022/7/3 19:05
     * @Params:
     * @Return: void
     **/
    public void showHouseList() {
        System.out.println("------------------����������Դ��------------------");
        houseService.addHouse();
    }

    /**
     * @Author: tor
     * @Description: 2 ���ҷ�����Ϣ
     * @Date: 2022/7/6 11:44
     * @Params:
     * @Return: void
     **/
    public void findHouse() {
        int tempId; //��������ķ��ݱ��
        String tempAddress; //��������ķ��ݵ�ַ

        System.out.println("------------------�� �� �� ��------------------");
        System.out.print("���ݱ��\t\t" + "���ݱ���\t\t" + "��ϵ�绰\t\t" + "��ַ\t\t" + "���\t\t" + "����״̬\n");
        System.out.println("����Ҫ����ʲô���������ҷ�����Ϣ��Ŀǰ��֧�ָ��ݱ�š���ַ��״̬�������ݲ�֧�֡�");
        System.out.println("��ѡ����Ҫ��ѯ������(1.���/2.��ַ/3.״̬/4.�˳�)��");

        do {
            switch (Utool.readMenuSelection1_4()) {
                case '1':
                    //1�����ݱ�Ų��ҷ�����Ϣ
                    do {
                        System.out.println("���ݱ�Ų���(���س��˳���ѯ)��");
                        tempId = Utool.readInt(-1);
                        if (tempId == -1) {
                            break;
                        } else {
                            System.out.println("------------------�� �� �� ��------------------");
                            System.out.print("���ݱ��\t\t" + "���ݱ���\t\t" + "��ϵ�绰\t\t" + "��ַ\t\t" + "���\t\t" + "����״̬\n");
                            if (houseService.findById(tempId) != null) {
                                System.out.println(houseService.findById(tempId));
                                break;
                            } else {
                                System.out.println("�Բ�����Ҫ���ҵķ��ݱ�Ų����ڡ�����������");
                            }
                        }
                    } while (true);
                    break;
                case '2':
                    //2�����ݵ�ַ���ҷ�����Ϣ
                    do {
                        System.out.println("���ݵ�ַ����(���س��˳���ѯ)��");
                        tempAddress = Utool.readString(20, "");
                        if (tempAddress.equals("")) {
                            break;
                        } else {
                            System.out.println("------------------�� �� �� ��------------------");
                            System.out.print("���ݱ��\t\t" + "���ݱ���\t\t" + "��ϵ�绰\t\t" + "��ַ\t\t" + "���\t\t" + "����״̬\n");
                            if (houseService.findByAddress(tempAddress) != null) {
                                System.out.println(houseService.findByAddress(tempAddress));
                                break;
                            } else {
                                System.out.println("�Բ����������ҵķ��ݵ�ַ��ʱû����ط�����Ϣ������������");
                            }
                        }
                    } while (true);
                    break;
                case '3':
                    //3�����ݷ���״̬���ҷ�����Ϣ
                    do {
                        System.out.println("���ݷ���״̬����(���س��˳���ѯ)��");
                        String tempState = Utool.readString(3, "");
                        if (houseService.findByState(tempState) != null) {
                            System.out.println("------------------�� �� �� ��------------------");
                            System.out.print("���ݱ��\t\t" + "���ݱ���\t\t" + "��ϵ�绰\t\t" + "��ַ\t\t" + "���\t\t" + "����״̬\n");
                            System.out.println(houseService.findByState(tempState));
                            break;
                        }
                        if (tempState == "") {
                            break;
                        } else {
                            System.out.println("�Բ����������ҵķ���״̬��ʱû����ط�����Ϣ������������");
                        }
                    } while (true);
                    break;
                case '4':
                    break;
            }
            break;
        } while (isexit);
    }

    /**
     * @Author: tor
     * @Description: 3 ɾ�����ݲ˵�
     * @Date: 2022/7/10 15:15
     * @Params: []
     * @Return: void
     **/
    public void delMenu() {
        System.out.println("------------------����ɾ����Դ��------------------");
        do {
            System.out.println("��������Ҫɾ���ķ��ݱ��(���س��˳�ɾ�����ݲ˵�)��");
            int houseId = Utool.readInt(-1);
            if (houseId == -1) {
                return;
            }
            System.out.println(houseService.delHouse(houseId));
        } while (true);
    }

    /**
     * @Author: tor
     * @Description:  4 �޸ķ�����Ϣ
     * @Date: 2022/7/11 22:05
     * @Params: []
     * @Return: void
     **/
    public void updateMenu() {
        System.out.println("------------------�����޸ķ�Դ��------------------");
        do {
            System.out.println("������Ҫ�޸ĵķ��ݱ��(���س������޸�)��");
            int houseId = Utool.readInt(-1);
            if (houseId == -1) {
                return;
            }
            House house = houseService.findById(houseId);
            if (house != null) {
                System.out.println("ԭ���ݱ��" + houseId + "��Ϣ����");
                System.out.println("���ݱ��⣺" + house.getHouseName());
                System.out.print("������Ҫ�޸ĵ��µķ��ݱ��⣺(���س�Ĭ�ϲ��޸�ԭ������Ϣ)");
                house.setHouseName(Utool.readString(20,house.getHouseName()));
                System.out.println("ԭ��ϵ�绰��" + house.getHousePhone());
                System.out.print("������Ҫ�޸ĵ��µ���ϵ�绰��(���س�Ĭ�ϲ��޸�ԭ������Ϣ)");
                house.setHousePhone(Utool.readString(11,house.getHousePhone()));
                System.out.println("ԭ��ַ��" + house.getHouseAddress());
                System.out.print("������Ҫ�޸ĵ��µĵ�ַ��(���س�Ĭ�ϲ��޸�ԭ������Ϣ)");
                house.setHouseAddress(Utool.readString(20,house.getHouseAddress()));
                System.out.println("ԭ���" + house.getHouseMoney());
                System.out.print("������Ҫ�޸ĵ��µ����(���س�Ĭ�ϲ��޸�ԭ������Ϣ)");
                house.setHouseMoney(Utool.readDouble(house.getHouseMoney()));
                System.out.println("ԭ����״̬��" + house.getState());
                System.out.print("������Ҫ�޸ĵ��µķ���״̬��(���س�Ĭ�ϲ��޸�ԭ������Ϣ)");
                house.setState(Utool.readString(3, house.getState()));
                System.out.println("�޸ĳɹ�");
                return;
            } else {
                System.out.println("�÷��ݱ�Ų����ڣ���ȷ�Ϻ���������");
            }
        }while (true);
    }

    /**
     * @Author: tor
     * @Description: 5 ��ʾ�����б�
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showHouse() {
        System.out.println("------------------�� �� �� ��------------------");
        System.out.print("���ݱ��\t\t" + "���ݱ���\t\t" + "��ϵ�绰\t\t" + "��ַ\t\t" + "���\t\t" + "����״̬\n");
        for (int i = 0; i < houseService.houseList().length; i++) {
            if (houseService.houseList()[i] == null) {
                break;
            }
            System.out.println(houseService.houseList()[i]);

        }
    }


}
