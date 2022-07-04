package JavaBasics_Mid.HouseRentSystem.HouseService;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseView.HouseView;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 12:17
 * @ע�� ���ݳ���ϵͳҵ���
 */
public class HouseService {
    //Ĭ�Ϸ��������Դ�2��
    private int houseNum = 2;
    //�������ݶ��󱣴淿����Ϣ
    private House[] houses = new House[houseNum];

    /**
     * @Author: tor
     * @Description: �����б�
     * @Date: 2022/7/4 12:49
     * @Params:
     * @Return: house[]
     **/
    public House[] houseList() {
        return houses;
    }

    /**
     * @Author: tor
     * @Description: ������Դ
     * @Date: 2022/7/4 14:11
     * @Params:
     * @Return:
     **/
    public void addHouse() {
        int initHouseNum = 1;//������һ�η���
        House house = new House();
        for (int i = 0; i < initHouseNum; i++) {
            System.out.println("��������Ҫ����ķ��ݱ��⣺");
            house.setHouseName(Utool.readString(20));
            System.out.println("��������Ҫ����ķ�����ϵ�绰��");
            house.setHousePhone(Utool.readString(11));
            System.out.println("��������Ҫ����ķ��ݵ�ַ��");
            house.setHouseAddress(Utool.readString(20));
            System.out.println("��������Ҫ����ķ������");
            house.setHouseMoney(Utool.readInt());
            System.out.println("��������Ҫ����ķ���״̬(��/δ����)");
            house.setState(Utool.readString(3));

            System.out.println("������ɣ���ȷ���Ƿ��ύ");
            if (Utool.readConfirmSelection() == 'Y') {//ȷ���Ƿ��ύ����ȷ�ϼ���Ϊ����
                houses[--houseNum] = house;
                System.out.println("������Դ�ɹ�");
                house.setHouseId(house.getHouseId() + 1);//�������
                return;

            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("������˱�����������");
                return;

            }
        }

        if (houseList().length == houseNum) {
            System.out.println("�����б��������޷���������");
            System.out.println("������Դʧ�ܣ�");

        } else {
            System.out.println("��������Ҫ����ķ��ݱ��⣺");
            house.setHouseName(Utool.readString(5));
            System.out.println("��������Ҫ����ķ�����ϵ�绰��");
            house.setHousePhone(Utool.readString(11));
            System.out.println("��������Ҫ����ķ��ݵ�ַ��");
            house.setHouseAddress(Utool.readString(20));
            System.out.println("��������Ҫ����ķ������");
            house.setHouseMoney(Utool.readInt());
            System.out.println("��������Ҫ����ķ���״̬(��/δ����)");
            house.setState(Utool.readString(3));

            System.out.println("������ɣ���ȷ���Ƿ��ύ");
            if (Utool.readConfirmSelection() == 'Y') {//ȷ���Ƿ��ύ����ȷ�ϼ���Ϊ����
                houses[houseNum--] = house;
                System.out.println("������Դ�ɹ�");
                house.setHouseId(house.getHouseId() + 1);//�������
            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("������˱�����������");
            }
        }
    }



    /**
     * @Author: tor
     * @Description: �˳��ⷿ�˵�
     * @Date: 2022/7/3 18:55
     * @Params: [houseView]
     * @Return: void
     **/
    public void exit(HouseView houseView) {
        if (Utool.readConfirmSelection() == 'Y') {
            houseView.setIsexit(false); //����HouseView�����ȡ�˵�����
            System.out.println("���Ѿ��˳��˷��ݳ���ϵͳ");
        } else if (Utool.readConfirmSelection() == 'N') {
            System.out.println("��������˳�����");
        }
    }
}
