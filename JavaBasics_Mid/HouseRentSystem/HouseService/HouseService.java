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
    private int houseNum = 2;
    //�������ݶ��󱣴淿����Ϣ
    private int initHouseNum = 0;//���������鸳��һ��ֵ�����ҵ�һ�����������ݣ����жϴ�С
    private House[] houses = new House[houseNum];

    /**
     * @Author: tor
     * @Description: 1 ������Դ
     * @Date: 2022/7/4 14:11
     * @Params:
     * @Return:
     **/
    public void addHouse() {
        for (int i = initHouseNum; i < 1; i++) {//������һ�η���
            houses[initHouseNum] = new House();
            System.out.println("��������Ҫ����ķ��ݱ��⣺");
            houses[initHouseNum].setHouseName(Utool.readString(20));
            System.out.println("��������Ҫ����ķ�����ϵ�绰��");
            houses[initHouseNum].setHousePhone(Utool.readString(11));
            System.out.println("��������Ҫ����ķ��ݵ�ַ��");
            houses[initHouseNum].setHouseAddress(Utool.readString(20));
            System.out.println("��������Ҫ����ķ������");
            houses[initHouseNum].setHouseMoney(Utool.readInt());
            System.out.println("��������Ҫ����ķ���״̬(��/δ����)");
            houses[initHouseNum].setState(Utool.readString(3));

            System.out.println("������ɣ���ȷ���Ƿ��ύ");
            if (Utool.readConfirmSelection() == 'Y') {//ȷ���Ƿ��ύ����ȷ�ϼ���Ϊ����
                System.out.println("������Դ�ɹ�");
                initHouseNum++;
                return;
            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("������˱�����������");
                houses[initHouseNum] = null;
                return;
            }
        }

        if (initHouseNum == 2 ) {//�����������2��
            System.out.println("�����б��������޷���������");
            System.out.println("������Դʧ�ܣ�");
            return;
        }
        houses[initHouseNum] = new House();
        System.out.println("��������Ҫ����ķ��ݱ��⣺");
        houses[initHouseNum].setHouseName(Utool.readString(5));
        System.out.println("��������Ҫ����ķ�����ϵ�绰��");
        houses[initHouseNum].setHousePhone(Utool.readString(11));
        System.out.println("��������Ҫ����ķ��ݵ�ַ��");
        houses[initHouseNum].setHouseAddress(Utool.readString(20));
        System.out.println("��������Ҫ����ķ������");
        houses[initHouseNum].setHouseMoney(Utool.readInt());
        System.out.println("��������Ҫ����ķ���״̬(��/δ����)");
        houses[initHouseNum].setState(Utool.readString(3));

        System.out.println("������ɣ���ȷ���Ƿ��ύ");
        if (Utool.readConfirmSelection() == 'Y') {//ȷ���Ƿ��ύ����ȷ�ϼ���Ϊ����
            System.out.println("������Դ�ɹ�");
            houses[initHouseNum].setHouseId(houses[initHouseNum].getHouseId() + 1);//�������
            initHouseNum++;
            return;
        } else if (Utool.readConfirmSelection() == 'N') {
            System.out.println("������˱�����������");
            houses[initHouseNum] = null;
            return;
        }
    }

    /**
     * @Author: tor
     * @Description: 2 ���ҷ�����Ϣ��id��
     * @Date: 2022/7/6 11:00
     * @Params: houseId
     * @Return: House
     **/
    public House findById(int houseId) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseId() == houseId){
                return houses[i];
            }
        }
        return null;
    }

    /**
     * @Author: tor
     * @Description: 2 ���ҷ�����Ϣ����ַ��
     * @Date: 2022/7/6 11:00
     * @Params: houseAddress
     * @Return: House
     **/
    public House findByAddress(String houseAddress) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseAddress().equals(houseAddress)){
                return houses[i];
            }
        }
        return null;
    }

    /**
     * @Author: tor
     * @Description: 2 ���ҷ�����Ϣ��״̬��
     * @Date: 2022/7/6 11:00
     * @Params: state
     * @Return: House
     **/
    public House findByState(String state) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getState().equals(state)){
                return houses[i];
            }
        }
        return null;
    }

    /**
     * @Author: tor
     * @Description: 5 �����б�
     * @Date: 2022/7/4 12:49
     * @Params:
     * @Return: house[]
     **/
    public House[] houseList() {
        return houses;
    }

    /**
     * @Author: tor
     * @Description: 6 �˳��ⷿ�˵�
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
