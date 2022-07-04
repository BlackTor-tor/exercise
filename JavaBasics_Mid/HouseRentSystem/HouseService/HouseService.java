package JavaBasics_Mid.HouseRentSystem.HouseService;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseView.HouseView;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 12:17
 * @注释 房屋出租系统业务层
 */
public class HouseService {
    //默认房屋最多可以存2个
    private int houseNum = 2;
    //创建房屋对象保存房屋信息
    private House[] houses = new House[houseNum];

    /**
     * @Author: tor
     * @Description: 房屋列表
     * @Date: 2022/7/4 12:49
     * @Params:
     * @Return: house[]
     **/
    public House[] houseList() {
        return houses;
    }

    /**
     * @Author: tor
     * @Description: 新增房源
     * @Date: 2022/7/4 14:11
     * @Params:
     * @Return:
     **/
    public void addHouse() {
        int initHouseNum = 1;//先增加一次房屋
        House house = new House();
        for (int i = 0; i < initHouseNum; i++) {
            System.out.println("请输入你要出租的房屋标题：");
            house.setHouseName(Utool.readString(20));
            System.out.println("请输入你要出租的房屋联系电话：");
            house.setHousePhone(Utool.readString(11));
            System.out.println("请输入你要出租的房屋地址：");
            house.setHouseAddress(Utool.readString(20));
            System.out.println("请输入你要出租的房屋租金");
            house.setHouseMoney(Utool.readInt());
            System.out.println("请输入你要出租的房屋状态(已/未出租)");
            house.setState(Utool.readString(3));

            System.out.println("输入完成，请确认是否提交");
            if (Utool.readConfirmSelection() == 'Y') {//确认是否提交，不确认即视为放弃
                houses[--houseNum] = house;
                System.out.println("新增房源成功");
                house.setHouseId(house.getHouseId() + 1);//序号自增
                return;

            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("你放弃了本次新增操作");
                return;

            }
        }

        if (houseList().length == houseNum) {
            System.out.println("房屋列表已满，无法继续新增");
            System.out.println("新增房源失败！");

        } else {
            System.out.println("请输入你要出租的房屋标题：");
            house.setHouseName(Utool.readString(5));
            System.out.println("请输入你要出租的房屋联系电话：");
            house.setHousePhone(Utool.readString(11));
            System.out.println("请输入你要出租的房屋地址：");
            house.setHouseAddress(Utool.readString(20));
            System.out.println("请输入你要出租的房屋租金");
            house.setHouseMoney(Utool.readInt());
            System.out.println("请输入你要出租的房屋状态(已/未出租)");
            house.setState(Utool.readString(3));

            System.out.println("输入完成，请确认是否提交");
            if (Utool.readConfirmSelection() == 'Y') {//确认是否提交，不确认即视为放弃
                houses[houseNum--] = house;
                System.out.println("新增房源成功");
                house.setHouseId(house.getHouseId() + 1);//序号自增
            } else if (Utool.readConfirmSelection() == 'N') {
                System.out.println("你放弃了本次新增操作");
            }
        }
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
        } else if (Utool.readConfirmSelection() == 'N') {
            System.out.println("你放弃了退出操作");
        }
    }
}
