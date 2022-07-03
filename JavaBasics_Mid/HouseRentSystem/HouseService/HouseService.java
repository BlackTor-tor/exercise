package JavaBasics_Mid.HouseRentSystem.HouseService;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseView.HouseView;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 12:17
 * @ע��  ���ݳ���ϵͳҵ���
 */
public class HouseService {
    //�������ݶ��󱣴淿����Ϣ
    private House[] houses;
    //Ĭ�Ϸ��������Դ�2��
    private int houseSize = 2;
   public House[] houseList() {
       houses = new House[houseSize];
       return houses;
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
        }else if (Utool.readConfirmSelection() == 'N') {
            System.out.println("��������˳�����");
        }
    }
}
