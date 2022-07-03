package JavaBasics_Mid.HouseRentSystem.HouseService;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseView.HouseView;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 12:17
 * @注释  房屋出租系统业务层
 */
public class HouseService {
    //创建房屋对象保存房屋信息
    private House[] houses;
    //默认房屋最多可以存2个
    private int houseSize = 2;
   public House[] houseList() {
       houses = new House[houseSize];
       return houses;
   }




    /**
     * @Author: tor
     * @Description: 退出租房菜单
     * @Date: 2022/7/3 18:55
     * @Params: [houseView]
     * @Return: void
     **/
    public void exit(HouseView houseView) {
        if (Utool.readConfirmSelection() == 'Y') {
            houseView.setIsexit(false); //创建HouseView对象获取菜单属性
            System.out.println("你已经退出了房屋出租系统");
        }else if (Utool.readConfirmSelection() == 'N') {
            System.out.println("你放弃了退出操作");
        }
    }
}
